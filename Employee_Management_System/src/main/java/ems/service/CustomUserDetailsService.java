package ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ems.entity.UserEntity;
import ems.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	// Injecting UserRepository to fetch user data from the database
	@Autowired
	private UserRepository repository;

	// This method loads user details when someone tries to log in
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		// Search user by username; if not found, throw an exception
		UserEntity user = repository
									.findByUsername(username)
									.orElseThrow(() -> 
										new UsernameNotFoundException("Username not found " + username));
		
		// Build and return a Spring Security User object
		// This object is used internally by Spring Security for authentication
		return User
				.withUsername(user.getUsername()) // set username
				.password(user.getPassword())     // set encrypted password
				.authorities(user.getRole())      // assign role (ADMIN or USER)
				.build();                         // create UserDetails object
	}	
}