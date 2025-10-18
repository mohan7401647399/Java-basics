package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.UserDTO;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

	// create user
	public UserDTO createUser(UserDTO dto) {
		// convert dto to Entity
		User user = modelMapper.map(dto, User.class);
		// save Entity to database
		User savedUser = userRepository.save(user);

		return modelMapper.map(savedUser, UserDTO.class);
	}

	// get all users
	public List<UserDTO> getAllUsers() {
		return userRepository.findAll().stream().map(user -> modelMapper.map(user, UserDTO.class))
				.collect(Collectors.toList());
	}

	// get user by id
	public UserDTO getUserById(int id) {
		// get exist user in in the database
		User user = userRepository.findById(id).orElseThrow();
		return modelMapper.map(user, UserDTO.class);
	}

	// update user
	public UserDTO updateUser(int id, UserDTO dto) {
		// get exist user id in the database
		User existingUser = userRepository.findById(id).orElseThrow();
		// get exist user id
		int userId = existingUser.getId();
		// convert dto to entity
		modelMapper.map(dto, existingUser);
		// set id to existUser after updating
		existingUser.setId(userId);
		// saved user to database
		User savedUser = userRepository.save(existingUser);
		return modelMapper.map(savedUser, UserDTO.class);
	}

	// delete a user
	public String deleteUser(int id) {
		userRepository.deleteById(id);
		return "User has been deleted";
	}
}
