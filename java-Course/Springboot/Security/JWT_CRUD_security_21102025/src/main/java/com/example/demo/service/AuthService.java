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

    @Autowired
    private CustomUserDetailsService userDetailsService;
    
    // Create a new user with encrypted password
    public UserEntity createUser(UserEntity user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return repository.save(user);
    }

    // Authenticate user and generate JWT token
    public String loginUser(UserEntity user) {
        // 1️. Authenticate credentials
        manager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        // 2️. Load user details
        UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUsername());

        // 3️. Generate token
        String token = jwtUtil.generateToken(userDetails);

        // 4️. Return token
        return token;
    }
}
