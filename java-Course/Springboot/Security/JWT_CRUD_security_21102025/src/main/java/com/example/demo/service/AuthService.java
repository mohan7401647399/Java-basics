package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.config.JwtUtil;
import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;

@Service
public class AuthService {

	@Autowired
	private UserRepository repository;

	@Autowired
	private PasswordEncoder encoder;

	@Autowired
	private AuthenticationManager manager;

	@Autowired
	private JwtUtil jwtUtil;

	private CustomUserDetailsService userDetailsService;

	public UserEntity createUser(UserEntity user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return repository.save(user);
	}

	public String LoginUser(UserEntity user) {
		manager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

		UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUsername());

		return jwtUtil.generateToken(userDetails);
	}
}
