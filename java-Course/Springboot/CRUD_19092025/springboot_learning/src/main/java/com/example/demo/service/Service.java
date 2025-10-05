package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Address;
import com.example.demo.model.User;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.DerivedQueryRepository;
import com.example.demo.repository.Repository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@org.springframework.stereotype.Service
@AllArgsConstructor
//	same class name
public class Service {

	@Autowired
	private final Repository repo;

	@Autowired
	private final DerivedQueryRepository dqrepo;

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

		//	get existing user
		User existingUser = repo.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found"));

		//	update basis fields
		if(user.getName() != null) existingUser.setName(user.getName());
		if(user.getAge() != 0) existingUser.setAge(user.getAge());		
		if(user.getEmail() != null) existingUser.setEmail(user.getEmail());
		if(user.getMobile_no() != null) existingUser.setMobile_no(user.getMobile_no());
		if(user.getSalary() != 0) existingUser.setSalary(user.getSalary());
		existingUser.setActive(user.isActive());

		//	update address
		if(user.getAddress() != null) {
			Address existingAddress = existingUser.getAddress();
			Address newAddress = user.getAddress();
			
			if(existingAddress == null) {
				newAddress.setUser(existingUser);
				existingUser.setAddress(newAddress);
			} else {
				if(newAddress.getCity() != null) existingAddress.setCity(newAddress.getCity());
			}
		}		
		return repo.save(existingUser);
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

	// Derived queries
	// delete by name
	public String deleteByName(String name) {
		long deletedCount = dqrepo.deleteByName(name);
		if (deletedCount > 0) {
			return deletedCount + "user deleted with name of " + name;
		} else {
			return "no user found with name of " + name;
		}
	}

	// find by name
	public List<User> DerivedAllQueries() {
//		return dqrepo.findByName(name);
//		return dqrepo.readByName(name);
//		return dqrepo.countByName(name);
//		return dqrepof.existsByName(name);
		return dqrepo.findAllByOrderByNameAsc();
//		return dqrepo.findByNameAndAge(name, age);
//		return dqrepo.findByNameOrAge(name, age);
//		return dqrepo.findByAgeBetween(age1, age2);
//		return dqrepo.findByAgeLessThan(age);
//		return dqrepo.findByAgeLessThanEqual(age);
//		return dqrepo.findByAgeGreaterThan(age);
//		return dqrepo.findByAgeGreaterThanEqual(age);
//		return dqrepo.findByNameIsNull();
//		return dqrepo.findByNameIsNotNull();
//		return dqrepo.findByNameNotNull();
//		return dqrepo.findByNameNotLike(name);
//		return dqrepo.findByNameStartingWith(name);
//		return dqrepo.findByNameEndingWith(name);
//		return dqrepo.findByNameContaining(name);
//		return dqrepo.findByNameNot(name);
//		return dqrepo.findByNameIn(name);
//		return dqrepo.findByNameNotIn(name);
//		return dqrepo.findByActiveTrue();
//		return dqrepo.findByActiveIsTrue();
//		return dqrepo.findByActiveFalse();
//		return dqrepo.findByActiveIsFalse();
//		return dqrepo.findByNameIgnoreCase(name);
//		return dqrepo.findTop5ByName(name);
//		return dqrepo.findFirstByName(name);
//		return dqrepo.findDistinctByName(name);
	}

	// find by all Id's
	public List<User> findByAllIds(List<Integer> ids) {
		return repo.findAllById(ids);
	}

	// find by name and age
	public List<User> findByNameAndAge(String name, int age) {
		return dqrepo.findByNameAndAge(name, age);
	}

	// find by name and age
	public List<User> findByNameOrAge(String name, int age) {
		return dqrepo.findByNameOrAge(name, age);
	}

	// HQL - queries
	// find by age
	public List<User> getByAge(int age) {
		return repo.getByAge(age);
	}

	// find name by id
	public String getUserByName(int id) {
		return repo.getUserById(id);
	}

	// all HQL - queries
	public int getAllUserQueries(int id, int salary) {
		return repo.getAllUserQueries(id, salary);
	}

}
