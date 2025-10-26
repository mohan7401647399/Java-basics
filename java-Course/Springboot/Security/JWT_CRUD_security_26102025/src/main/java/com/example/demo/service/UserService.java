package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<UserEntity> getAllUsers() {
		return repository.findAll();
	}

	public UserEntity getUser(int id) {
		return repository.findById(id).orElseThrow();
	}

	public UserEntity updateUser(int id, UserEntity user) {
		UserEntity existingUser = repository.findById(id).orElseThrow();

		if (existingUser != null) {
			existingUser.setUsername(user.getUsername());
			return repository.save(existingUser);
		}
		return null;
	}

	public String deleteUser(int id) {
		repository.deleteById(id);
		return "User has been deleted";
	}

}
