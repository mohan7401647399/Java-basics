package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/home")
	public String home() {
		return "Welcome to the Home Page! (No authentication required)";
	}
	
	
	@GetMapping("/user/dashboard")
	public String userDashboard() {
		return "Welcome USER! This is your dashboard.";
	}
	
	@GetMapping("/admin/dashboard")
	public String adminDashboard() {
		return "Welcome ADMIN! This is your admin dashboard.";
	}
	
	
	@GetMapping("/role/dashboard")
	public String roleDashboard() {
		return "Welcome ROLE_USER! This is your ROLE_USER dashboard.";
	}
}
