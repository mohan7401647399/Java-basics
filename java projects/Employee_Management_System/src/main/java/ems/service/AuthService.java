package ems.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ems.entity.UserEntity;
import ems.repository.UserRepository;
import ems.util.JwtUtils;

@Service
public class AuthService {

	// Injecting UserRepository to interact with the database
	@Autowired
	private UserRepository repository;

	// Used to authenticate username & password during login
	@Autowired
	private AuthenticationManager authenticationManager;

	// Loads user details from DB for authentication
	@Autowired
	private UserDetailsService userDetailsService;

	// Utility class for generating JWT tokens
	@Autowired
	private JwtUtils jwtUtil;

	// Used to encode (hash) passwords before saving to DB
	@Autowired
	private PasswordEncoder passwordEncoder;

	// -------------------- REGISTER USER --------------------
	public UserEntity registerUser(UserEntity user) {

		// Encode the raw password before saving for security
		user.setPassword(passwordEncoder.encode(user.getPassword()));

		// Save the user to database and return saved object
		return repository.save(user);
	}

	// ---------------------- LOGIN USER ----------------------
	public Map<String, String> loginUser(UserEntity user) {

		// Authenticate username and password
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(
						user.getUsername(),
						user.getPassword()
				)
		);

		// Load user details from DB
		UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUsername());

		// Generate JWT token using user details
		String token = jwtUtil.generateToken(userDetails);

    // Return token + success message as response
		return Map.of("token", token, "message", "Login Successful");
	}
}