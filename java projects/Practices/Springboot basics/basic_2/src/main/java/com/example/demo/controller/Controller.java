package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
public class Controller {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Springboot";
	}
	
	@GetMapping("/welcome")
	public String sayWelcome() {
		return "Welcome to Springboot";
	}
	
	@GetMapping("/about")
	public String sayAbout() {
		return "About Springboot";
	}
	
	@GetMapping("/say/{name}")
	public String SaySomethingPath(@PathVariable String name) {
		return "Entered name is " + name;
	}
	
	@GetMapping("/say")
	public String SaySomethingParam(@RequestParam String name) {
		return "Entered name is " + name;
	}
	
	@PostMapping("/post")
	public String createUser(@RequestBody User user) {
		return "Entered name " + user.getName() + " and email id is " + user.getEmail();
	}
}
