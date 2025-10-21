package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserEntity;
import com.example.demo.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private AuthService authService;

	@PostMapping("/register")
	public UserEntity createUser(@RequestBody UserEntity user) {
		return authService.createUser(user);
	}

	@PostMapping("/login")
	public String loginUser(@RequestBody UserEntity user) {
		return authService.LoginUser(user);
	}
}
