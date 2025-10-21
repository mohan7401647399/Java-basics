package com.example.demo.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;

@Service
public class UserSecurity {

	// Injects the UserRepository dependency automatically using Spring's IoC
	@Autowired
	private UserRepository userRepository;

	// Injects the PasswordEncoder dependency automatically using Spring's IoC
	@Autowired
	private PasswordEncoder passwordEncoder;

	// create user
	public UserEntity createUser(UserEntity user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

	// fetch all users from the DB
	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

	// get a single user by their unique ID
	public UserEntity getUserById(int id) {
		return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with ID " + id));
	}
}
