package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.UserDTO;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public UserDTO createUser(@RequestBody UserDTO dto) {
		return userService.createUser(dto);
	}

	@GetMapping("/getAll")
	public List<UserDTO> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/get/{id}")
	public UserDTO getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}

	@PutMapping("/update/{id}")
	public UserDTO updateUser(@PathVariable int id, @RequestBody UserDTO dto) {
		return userService.updateUser(id, dto);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		return userService.deleteUser(id);
	}
}
