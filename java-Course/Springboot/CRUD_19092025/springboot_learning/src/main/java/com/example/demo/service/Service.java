package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.User;
import com.example.demo.repository.Repository;

import jakarta.transaction.Transactional;

@org.springframework.stereotype.Service
//	same class name
public class Service {

	@Autowired
	private final Repository repo;

	public Service(Repository repo) {
		this.repo = repo;
	}

	// create
	public User createUser(User user) {
		return repo.save(user);
	}

	// get all users
	public List<User> getAllUsers() {
		return repo.findAll();
	}

	// get single user
	public User getUser(int id) {
//		return repo.findById(id).orElse(new User());
		return repo.findById(id).orElse(null);
	}

	// update user
	public User updateUser(int id, User user) {
		User newUser = repo.findById(id).orElseThrow();
		newUser.setName(user.getName());
		newUser.setAge(user.getAge());
		newUser.setEmail(user.getEmail());
		newUser.setMobile_no(user.getMobile_no());
		newUser.setSalary(user.getSalary());
		return repo.save(newUser);
	}

	// delete user
	public String deleteUser(int id) {
		repo.deleteById(id);
		return "User deleted";
	}

	// delete all users
	public String deleteAllUsers() {
		repo.deleteAll();
		return "All users deleted";
	}

	// delete by name
	public String deleteByName(String name) {
		long deletedCount = repo.deleteByName(name);
		if (deletedCount > 0) {
			return deletedCount + "user deleted with name of " + name;
		} else {
			return "no user found with name of " + name;
		}
	}

	// find by name
	public List<User> findByName() {
//		return repo.findByName(name);
//		return repo.readByName(name);
//		return repo.readByName(name);
//		return repo.countByName(name);
//		return repo.existsByName(name);
		return repo.findAllByOrderByNameAsc();
	}

	// find by all Id's
	public List<User> findByAllIds(List<Integer> ids) {
		return repo.findAllById(ids);
	}

	// find by name and age
	public List<User> findByNameAndAge(String name, int age) {
		return repo.findByNameAndAge(name, age);
	}

	// find by name and age
	public List<User> findByNameAOrAge(String name, int age) {
		return repo.findByNameAndAge(name, age);
	}

	// find by age - HQL
	public List<User> getByAge(int age) {
		return repo.getByAge(age);
	}

	// find name by id - HQL
	public String getUserByName(int id) {
		return repo.getUserById(id);
	}

	// all HQL - queries
	public int getAllUserQueries(int id, int salary) {
		return repo.getAllUserQueries(id, salary);
	}
}
