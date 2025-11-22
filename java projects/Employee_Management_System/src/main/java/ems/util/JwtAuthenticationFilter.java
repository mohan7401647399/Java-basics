package ems.util;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	@Autowired
	private JwtUtils jwtUtil;   // Utility class for generating & validating JWT tokens

	@Autowired
	private UserDetailsService userDetailsService; // Loads user details from DB

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		// Get the Authorization header from the incoming request
		String authHeader = request.getHeader("Authorization");

		// Check if the header is present and starts with "Bearer "
		if (authHeader != null && authHeader.startsWith("Bearer ")) {

			// Extract the actual JWT token (remove "Bearer ")
			String jwt = authHeader.substring(7);

			// Extract username from JWT token
			String username = jwtUtil.extractUsername(jwt);

			// Check if username exists and no authentication is currently set
			if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {

				// Load user details from database using username
				UserDetails userDetails = userDetailsService.loadUserByUsername(username);

				// Validate the token (check signature, expiry, username match)
				if (jwtUtil.validateToken(jwt, userDetails)) {

					// Create authentication object with user details and roles
					UsernamePasswordAuthenticationToken authToken =
							new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());

					// Set authentication in security context (user is now logged in)
					SecurityContextHolder.getContext().setAuthentication(authToken);
				}
			}
		}

		// Pass the request to the next filter in the chain
		filterChain.doFilter(request, response);
	}
}