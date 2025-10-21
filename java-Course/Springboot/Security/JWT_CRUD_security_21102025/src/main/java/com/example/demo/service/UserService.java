package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

	public UserEntity getUserById(int id) {
		return userRepository.findById(id).orElseThrow();
	}

	public UserEntity updateUser(int id, UserEntity user) {
		UserEntity existingUser = userRepository.findById(id).orElseThrow();

		if (existingUser != null) {
			existingUser.setUsername(user.getUsername());
			existingUser.setRole(user.getRole());

			return userRepository.save(existingUser);
		}
		return null;
	}

	public String deleteUser(int id) {
		UserEntity user = userRepository.findById(id).orElseThrow();

		userRepository.deleteById(id);

		return "User has been deleted";
	}
}
