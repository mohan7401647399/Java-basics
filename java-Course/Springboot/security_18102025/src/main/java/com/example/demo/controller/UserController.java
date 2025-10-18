package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserEntity;
import com.example.demo.security.UserSecurity;

@RestController
@RequestMapping("/user")
public class UserController {

	// Injects UserSecurity service to handle business logic related to user management
	@Autowired
	private UserSecurity userSecurity;

	// Injects PasswordEncoder to securely encrypt passwords before saving to the database
	@Autowired
	private PasswordEncoder passwordEncoder;

	@PostMapping("/create")
	public UserEntity createUser(@RequestBody UserEntity user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userSecurity.createUser(user);
	}

	@GetMapping("/getAll")
	public List<UserEntity> getAllUsers() {
		return userSecurity.getAllUsers();
	}

	@GetMapping("/get/{id}")
	public UserEntity getUserById(int id) {
		return userSecurity.getUserById(id);
	}
}
