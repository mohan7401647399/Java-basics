package ems.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ems.entity.UserEntity;
import ems.service.AuthService;

@RestController                           // Marks this class as a REST controller
@RequestMapping("/api/auth")              // Base URL for all authentication-related APIs
public class AuthController {

	@Autowired
	private AuthService authService;       // Injecting AuthService to handle authentication logic

	@PostMapping("/signup")                // API: POST /api/auth/signup
	public UserEntity registerUser(@RequestBody UserEntity user) {
		
		// Accepts user details from request body and calls service to save new user
		return authService.registerUser(user);
	}

	@PostMapping("/login")                 // API: POST /api/auth/login
	public ResponseEntity<?> loginUser(@RequestBody UserEntity user) {
		
		try {
			// Calls service to validate user credentials and generate JWT tokens
			Map<String, String> tokens = authService.loginUser(user);

			// If login is successful, return the generated tokens
			return ResponseEntity.ok(tokens);

		} catch (Exception e) {
			// If login fails, return HTTP 401 Unauthorized with a message
			return ResponseEntity.status(401).body("Invalid Credentials");
		}
	}
}
