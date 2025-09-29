package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.Service;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class Controller {

	@Autowired
	private final Service service;

	public Controller(Service service) {
		this.service = service;
	}

	@PostMapping("/create")
//	public User createUser(@RequestBody User user) {
	public User createUser(@ModelAttribute User user) {
		return service.createUser(user);
	}

	@GetMapping("/getAllUsers")
	public List<User> getAllUser() {
		return service.getAllUsers();
	}

	@GetMapping("/getUser/{id}")
	public ResponseEntity<User> getUser(@PathVariable int id) {
		User s1 = service.getUser(id);
		if (s1 == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(s1, HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User user) {
		return service.updateUser(id, user);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		service.deleteUser(id);
		return "user has been deleted";
	}

	@DeleteMapping("/deleteAll")
	public String delteAllUsers() {
		service.deleteAllUsers();
		return "All users deleted";
	}

	@GetMapping("/findName")
	public List<User> findByUserName() {
		return service.findByName();
	}
	
	@DeleteMapping("/deleteByName/{name}")
	public String deleteByName(@PathVariable String name) {
		service.deleteByName(name);
		return "user deleted";
	}

	@GetMapping("/by-ids")
	public List<User> findByAllIds(@RequestParam List<Integer> ids) {
		return service.findByAllIds(ids);
	}

	@GetMapping("/nameandage")
	public List<User> findByNameAndAge(@RequestParam String name, @RequestParam int age) {
		return service.findByNameAndAge(name, age);
	}

	@GetMapping("/nameorage")
	public List<User> findByNameOrAge(@RequestParam String name, @RequestParam int age) {
		return service.findByNameAndAge(name, age);
	}

	@GetMapping("/getByAge/{age}")
	public List<User> getByAge(@PathVariable int age) {
		return service.getByAge(age);
	}

	@GetMapping("/getUserByName/{id}")
	public String getUserByName(@PathVariable int id) {
		return service.getUserByName(id);
	}

	@GetMapping("/getAllUserQueries/{id}")
	public String getAllUserQueries(@PathVariable int id, @RequestParam("salary") int salary) {
		int deletedId = service.getAllUserQueries(id, salary);
		return deletedId > 0 ? "User has been deleted" : "User not found";
	}
}
