package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//	@GetMapping("/home")
	@GetMapping("/")
	public String getHomePage() {
		return "Welcome to HomePage";
	}

	@GetMapping("/dashboard")
	public String getDashboardPage() {
		return "Login successful";
	}
}
