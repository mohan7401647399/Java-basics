package com.example.demo.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;

@Service
public class UserSecurity {

	// Injects the UserRepository dependency automatically using Spring's IoC
	@Autowired
	private UserRepository userRepository;

	//	create user
	public UserEntity createUser(UserEntity user) {
		return userRepository.save(user);
	}

	//	fetch all users from the DB
	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

	//	get a single user by their unique ID
	public UserEntity getUserById(int id) {
		UserEntity existingUser = userRepository.findById(id).orElseThrow();
		return existingUser;
	}
}
