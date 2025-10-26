package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;

/**
 * Custom implementation of Spring Security's UserDetailsService interface.
 * This class is responsible for loading user-specific data during authentication.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	// Injecting UserRepository to access the user data from the database
	@Autowired
	private UserRepository repository;

	
	/**
	 * This method is called by Spring Security during the authentication process.
	 * It loads the user details (username, password, roles) from the database
	 * based on the given username.
	 *
	 * @param username - the username entered during login
	 * @return UserDetails - Spring Security-compatible user object
	 * @throws UsernameNotFoundException - if no user is found with the given username
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// Fetching user from the database using the repository
		UserEntity user = repository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Username not found " + username));
		
		// Creating a Spring Security User object using user details fetched from database
		return User
				.withUsername(user.getUsername())	// Set username
				.password(user.getPassword())		// Set encoded password
				.roles(user.getRole())				// Set role(s) (e.g., "USER", "ADMIN")
				.build();							// Build the UserDetails object
	}
}