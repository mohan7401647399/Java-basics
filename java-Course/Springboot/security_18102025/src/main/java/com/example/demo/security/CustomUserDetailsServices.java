package com.example.demo.security;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;

import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;

/**
 * Custom implementation of Spring Security's UserDetailsService interface. This
 * class is responsible for loading user-specific data from the database when a
 * user attempts to authenticate (login).
 */
public class CustomUserDetailsServices implements UserDetailsService {

	// Injecting UserRepository to access user data from the database
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// Fetch the user from the database using the repository
		UserEntity user = userRepository.findByUsername(username);

		// If the user does not exist, throw an exception
		if (user == null) {
			throw new UsernameNotFoundException("username not found " + username);
		}

		return new User(user.getUsername(), user.getPassword(),
				Collections.singleton(new SimpleGrantedAuthority("User_Role")));
	}

}
