package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public String registerUser(UserEntity user) {
		repository.save(user);
		return "User has been registered " + user.getName();
	}
	
	public String loginUser() {
		return "Logged In";
	}
}
