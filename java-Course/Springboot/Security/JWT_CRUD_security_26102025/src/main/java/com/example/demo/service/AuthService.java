package com.example.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.configs.JwtUtil;
import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;

@Service
public class AuthService {

	@Autowired
	private AuthenticationManager manager;

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private UserRepository repo;

	@Autowired
	private PasswordEncoder encoder;

	public UserEntity register(UserEntity user) {
		user.setPassword(encoder.encode(user.getPassword()));

		return repo.save(user);
	}

	public Map<String, String> login(UserEntity user) {
		manager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

		UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUsername());

		String token = jwtUtil.generateToken(userDetails);

		return Map.of("token", token);
	}
}
