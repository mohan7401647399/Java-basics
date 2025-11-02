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
	
	//	get all users
	public List<UserEntity> getAll(){
		return userRepository.findAll();
	}
	
	//	get user by id
	public UserEntity getUser(int id) {
		return userRepository.findById(id).orElseThrow();
	}	
}
