package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserEntity;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/auth")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public UserEntity registerUser(@RequestBody UserEntity user) {
		return userService.registerUser(user);
	}

	@PostMapping("/login")
	public Map<String, String> loginUser(@RequestBody UserEntity user) {
		return userService.loginUser(user);
	}
}
