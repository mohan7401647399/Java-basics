package org.example.testproject_05032026.controller;

import java.util.List;
import java.util.Optional;

import org.example.testproject_05032026.model.UserModel;
import org.example.testproject_05032026.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")   // ✅ base path (clean API design)
public class UserController {

	@Autowired
	private UserService userService;

	// ✅ GET ALL USERS
	@GetMapping("/users")
	public List<UserModel> getAllUsers() {
		return userService.getAllUsers();
	}

	// ✅ GET USER BY ID
	@GetMapping("/users/{id}")
	public Optional<UserModel> getByUserId(@PathVariable int id) {
		return userService.getByUserId(id);
	}

	// ✅ CREATE USER
	@PostMapping("/users")
	public UserModel createUser(@RequestBody UserModel user) {
		return userService.createUser(user);
	}

	// ✅ UPDATE USER
	@PutMapping("/users/{id}")
	public UserModel updateUser(@PathVariable int id, @RequestBody UserModel user) {
		return userService.updateUser(id, user);
	}

	// ✅ DELETE ALL USERS
	@DeleteMapping("/users")
	public String deleteAllUsers() {
		return userService.deleteAllUsers();
	}

	// ✅ DELETE USER BY ID
	@DeleteMapping("/users/{id}")
	public String deleteUserById(@PathVariable int id) {
		return userService.deleteUserById(id);
	}
}