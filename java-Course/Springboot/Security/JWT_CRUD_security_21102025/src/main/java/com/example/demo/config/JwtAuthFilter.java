package com.example.demo.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.demo.service.CustomUserDetailsService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// JwtAuthFilter intercepts every incoming HTTP request once (per request) and validates the JWT token if present in the request header.
@Component
public class JwtAuthFilter extends OncePerRequestFilter {

	@Autowired
	private JwtUtil jwtUtil;	// Utility class for generating, validating, and extracting data from JWT tokens

	@Autowired
	private CustomUserDetailsService customUserDetailsService;	// Service to load user details from the database

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		// Step 1: Extract the Authorization header from the incoming request
		String header = request.getHeader("Authorization");
		String token = null;
		String username = null;

		// Step 2: Check if the header is null or does not start with "Bearer "
		// If not valid, skip the JWT validation and continue the filter chain
		if (header == null || !header.startsWith("Bearer ")) {
			filterChain.doFilter(request, response);
			return;
		}

		// Step 3: If the header starts with "Bearer ", extract the token part
		if (header != null && header.startsWith("Bearer ")) {
			token = header.substring(7);
			username = jwtUtil.extractUsername(token);
		}

		// Step 4: Proceed only if we have a valid username and no authentication yet
		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			// Load user details from the database using the username extracted from token
			UserDetails userDetails = customUserDetailsService.loadUserByUsername(username);

			// Step 5: Validate the token using the loaded user details
			if (jwtUtil.validateToken(token, userDetails)) {
				// Step 6: Create an authentication object for Spring Security
				UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userDetails,
						null, userDetails.getAuthorities());

				// Step 7: Attach request details (like IP, session ID) to the authentication object
				authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				
				// Step 8: Set authentication into the SecurityContext, marking the user as authenticated
				SecurityContextHolder.getContext().setAuthentication(authToken);
			}
		}

		// Step 9: Continue to the next filter in the chain
		filterChain.doFilter(request, response);

	}

}
