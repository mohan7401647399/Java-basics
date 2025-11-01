package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserEntity;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public UserEntity registerUser(@RequestBody UserEntity user) {
		return userService.registerUser(user);
	}

	// get users
	@GetMapping("/user/get")
	public List<UserEntity> getUsers() {
		return userService.getUsers();
	}

	@GetMapping("/admin/get")
	public List<UserEntity> getUsersAll() {
		return userService.getUsersAll();
	}
}
