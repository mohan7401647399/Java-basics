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

	//	create user
	public String registerUser(UserEntity user) {
		repository.save(user);
		return "User has been registered " + user.getName();
	}
	
	//	get all users
	public List<UserEntity> getAll() {
		return repository.findAll();
	}
}
