package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserEntity;
import com.example.demo.security.JwtUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {

	// AuthenticationManager is provided by Spring Security to handle authentication logic
	@Autowired
	private AuthenticationManager authManager;

	// JwtUtil is a custom utility class responsible for generating and validating JWT tokens
	@Autowired
	private JwtUtil jwtUtil;

	// POST endpoint for user login — accessible at: /auth/login
	@PostMapping("/login")
	public ResponseEntity<Map<String, String>> login(@RequestBody UserEntity user) {
		try {
			// Step 1: Authenticate the user credentials using AuthenticationManager
			// UsernamePasswordAuthenticationToken is a built-in class that wraps the username and password
			Authentication authentication = authManager.authenticate(
					new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

			// Step 2: Extract authenticated user details
			UserDetails userDetails = (UserDetails) authentication.getPrincipal();

			// Step 3: Generate JWT token for the authenticated user
			String token = jwtUtil.generateToken(userDetails);

			// Step 4: Return token and type (Bearer) as JSON response
			// Example response: { "token": "xxxxx.yyyyy.zzzzz", "type": "Bearer" }
			return ResponseEntity.ok(Map.of("token", token, "type", "Bearer"));

		} catch (Exception e) {
			// If authentication fails (wrong username or password)
			System.err.println("Authentication failed for user: " + user.getUsername());
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
					.body(Map.of("error", "Invalid username or password"));
		}
	}
}
