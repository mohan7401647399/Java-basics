package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.UserModel;

@Service
public class UserService {

	public String createUser(UserModel user) {
		return "User name is " + user.getName() + " and email id is " + user.getEmail();
	}
}
