package com.EmployeeAttendanceBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeAttendanceBackend.DTO.AuthRequest;
import com.EmployeeAttendanceBackend.DTO.SignupRequest;
import com.EmployeeAttendanceBackend.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	private AuthService authService;

	@PostMapping("/signup")
	public ResponseEntity<?> signup(@RequestBody SignupRequest request) {
		return authService.signup(request);
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody AuthRequest request) {
		return authService.login(request);
	}
	
    @PostMapping("/logout")
    public ResponseEntity<?> logout(Authentication authentication) {

        if (authentication != null) {
            return ResponseEntity.ok("User logged out: " + authentication.getName());
        }
        return ResponseEntity.ok("Logged out successfully");
    }
}