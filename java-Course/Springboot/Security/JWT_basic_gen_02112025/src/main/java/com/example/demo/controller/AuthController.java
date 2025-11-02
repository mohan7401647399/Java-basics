package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserEntity;
import com.example.demo.service.JWTService;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private UserService userService;

	@Autowired
	private JWTService jwtService;

	@PostMapping("/register")
	public UserEntity registerUser(@RequestBody UserEntity user) {
		return userService.registerUser(user); 
	}

	@PostMapping("/login")
	public Map<String, String> login(@RequestBody Map<String, String> request) {
		String username = request.get("username");
		String password = request.get("password");

		if (userService.validateUser(username, password)) {
			String token = jwtService.generateToken(username);

			Map<String, String> response = new HashMap<>();
			response.put("token", token);

			return response;
		} else {
			throw new RuntimeException("Invalid Credentials");
		}
	}
}
