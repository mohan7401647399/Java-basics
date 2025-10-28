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
	private UserService service;
	
	@GetMapping("/")
	public String homePage() {
		return "Welcome, authenticated user!";
	}

	@PostMapping("/register")
	public String registerUser(@RequestBody UserEntity user) {
		return service.registerUser(user);
	}

	@GetMapping("/getAll")
	public List<UserEntity> getAllUsers(){
		return service.getAll();
	}
}
