package ems.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ems.entity.UserEntity;
import ems.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	private AuthService authService;

	@PostMapping("/signup")
	public UserEntity registerUser(@RequestBody UserEntity user) {
		return authService.registerUser(user);
	}

	@PostMapping("/login")
	public Map<String, String> loginUser(@RequestBody UserEntity user) {
		return authService.loginUser(user);
	}
}
