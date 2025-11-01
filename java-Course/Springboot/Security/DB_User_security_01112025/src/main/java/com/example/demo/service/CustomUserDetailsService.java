package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;

@Component
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity user = repository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User name not found " + username));
		
		UserDetails userDetails = User
									.builder()
									.username(user.getUsername())
									.password(user.getPassword())
									.roles(user.getRole().toUpperCase())
									.build();		
		return userDetails;
	}	
}
