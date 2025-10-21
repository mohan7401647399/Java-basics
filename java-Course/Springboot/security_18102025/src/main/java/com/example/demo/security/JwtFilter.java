package com.example.demo.security;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * JwtFilter is a custom filter that intercepts every incoming HTTP request once,
 * extracts the JWT token from the Authorization header, validates it,
 * and sets the user authentication in the Spring Security context if valid.
 */
@Component
public class JwtFilter extends OncePerRequestFilter {

    // Utility class for generating, extracting, and validating JWT tokens
    @Autowired
    private JwtUtil jwtUtil;

    // Service to load user-specific data (from DB or in-memory) during authentication
    @Autowired
    private CustomUserDetailsServices customUserDetailsServices;

    /**
     * This method executes once per request.
     * It checks for a JWT token in the request header, validates it,
     * and sets authentication if the token is valid.
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        // Get the "Authorization" header from the HTTP request
        String authHeader = request.getHeader("Authorization");

        // Variables to store token and username
        String token = null;
        String username = null;

        /**
         * ✅ Step 1: Check if header is not null and starts with "Bearer "
         * The header should look like: "Authorization: Bearer <token>"
         */
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            // Remove "Bearer " prefix and extract the token only
            token = authHeader.substring(7);
            // Extract username (subject) from the JWT token
            username = jwtUtil.extractUsername(token);
        }

        try {
            /**
             * ✅ Step 2: Proceed only if username is found and no authentication exists yet
             * This prevents re-authentication of already authenticated users.
             */
            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {

                // Load user details (like username, password, roles) from DB
                UserDetails userDetails = customUserDetailsServices.loadUserByUsername(username);

                // ✅ Step 3: Validate token using JwtUtil
                if (jwtUtil.validateToken(token, userDetails)) {

                    /**
                     * Create authentication token containing:
                     * - Principal (user details)
                     * - Credentials (null, since password isn’t needed here)
                     * - Authorities (roles/permissions)
                     */
                    UsernamePasswordAuthenticationToken authenticationToken =
                            new UsernamePasswordAuthenticationToken(
                                    userDetails, null, userDetails.getAuthorities());

                    // Attach request details (like IP, session) to the authentication
                    authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                    // ✅ Step 4: Set the authentication in the SecurityContext
                    // This marks the user as authenticated for the current request
                    SecurityContextHolder.getContext().setAuthentication(authenticationToken);
                }
            }
        } catch (Exception e) {
            // If token validation fails, return HTTP 401 Unauthorized
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return;
        }

        // Continue filter chain for next filters or endpoints
        filterChain.doFilter(request, response);
    }
}
