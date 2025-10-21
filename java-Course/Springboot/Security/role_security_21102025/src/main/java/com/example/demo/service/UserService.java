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
	private UserRepository repository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public UserEntity createUser(UserEntity user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));

		return repository.save(user);
	}

	public List<UserEntity> getAllUsers() {
		return repository.findAll();
	}

	public UserEntity getUserById(int id) {
		return repository.findById(id).orElseThrow();
	}

	public UserEntity updateUser(int id, UserEntity entity) {
		UserEntity user = repository.findById(id).orElseThrow();

		if (user != null) {
			user.setUsername(entity.getUsername());
			user.setPassword(passwordEncoder.encode(entity.getPassword()));
			user.setRole(entity.getRole());

			return repository.save(user);
		}
		return null;
	}

	public String deleteUser(int id) {
		repository.deleteById(id);
		return "User has been deleted";
	}
}
