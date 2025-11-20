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
import ems.repository.RoleRepository;
import ems.repository.UserRepository;
import ems.util.JwtUtils;


@Service
public class AuthService {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private JwtUtils jwtUtil;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	
	// register user
	public UserEntity registerUser(UserEntity user) {
		String plainPassword = user.getPassword();
		String encryptedPassword = passwordEncoder.encode(plainPassword);
		user.setPassword(encryptedPassword);
		return repository.save(user);
	} 


	//	login user
	public Map<String, String> loginUser(UserEntity user) {
		authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

		UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUsername());
		String token = jwtUtil.generateToken(userDetails);

		return Map.of("token", token);
	}
}

