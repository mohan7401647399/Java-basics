package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	// user registration
	public UserEntity registerUser(UserEntity user) {
		String plainPassword = user.getPassword();
		String encryptedPassword = passwordEncoder.encode(plainPassword);
		user.setPassword(encryptedPassword);
		
		return userRepository.save(user); 
	}

	// get users
	public List<UserEntity> getUsers() {
		return userRepository.findAll();
	}

	// get admin users
	public List<UserEntity> getUsersAll() {
		return userRepository.findAll();
	}
}
