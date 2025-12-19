package com.EmployeeAttendanceBackend.service;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.EmployeeAttendanceBackend.DTO.AuthRequest;
import com.EmployeeAttendanceBackend.DTO.SignupRequest;
import com.EmployeeAttendanceBackend.entity.User;
import com.EmployeeAttendanceBackend.repository.UserRepository;
import com.EmployeeAttendanceBackend.utils.JwtUtil;

@Service
public class AuthService {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private UserDetailsService userDetailsService;

	public ResponseEntity<?> login(AuthRequest user) {
		try {
			authenticationManager
					.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid crediantials - Username or Password. Please check and try again");
		}

		UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUsername());

		final String jwt = jwtUtil.generateToken(userDetails);

		return ResponseEntity.ok(Map.of("jwt", jwt));
	}

	// user registration
	public ResponseEntity<?> signup(SignupRequest request) {
		if (userRepository.findByUsername(request.getUsername()).isPresent()) {
			return ResponseEntity.badRequest().body("Username already exists");
		}

		User newUser = new User();

		newUser.setUsername(request.getUsername());
		newUser.setPassword(passwordEncoder.encode(request.getPassword()));

		userRepository.save(newUser);

		return ResponseEntity.ok("User registered successfully");
	}
}