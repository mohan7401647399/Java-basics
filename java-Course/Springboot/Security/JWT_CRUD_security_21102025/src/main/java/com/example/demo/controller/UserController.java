package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserEntity;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/all")
	public List<UserEntity> getAllUsers() {
		return service.getAllUsers();
	}

	@GetMapping("/{id}")
	public UserEntity getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}

	@PutMapping("/{id}")
	public UserEntity updateUser(@PathVariable int id, @RequestBody UserEntity user) {
		return service.updateUser(id, user);
	}

	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}
}
