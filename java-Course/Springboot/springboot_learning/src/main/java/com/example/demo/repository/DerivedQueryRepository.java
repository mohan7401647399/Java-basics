package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

import jakarta.transaction.Transactional;

public interface DerivedQueryRepository extends JpaRepository<User, Integer>{

	// custom method - Derived query
	public User findByName(String name);
	public User readByName(String name);
	public User getByName(String name);
	public int countByName(String name);
	public boolean existsByName(String name);
	public List<User> findAllByOrderByNameAsc();
	
	@Transactional
	public Long deleteByName(String name);
	
	// AND / OR
	public List<User> findByNameAndAge(String name, int age);
	public List<User> findByNameOrAge(String name, int age);
	
	// Range queries
	public List<User> findByAgeBetween(int startAge, int endAge);
	public List<User> findByAgeLessThan(int age);
	public List<User> findByAgeLessThanEqual(int age);
	public List<User> findByAgeGreaterThan(int age);
	public List<User> findByAgeGreaterThanEqual(int age);
	
	// NULL checks
	public List<User> findByNameIsNull();
	public List<User> findByNameIsNotNull();
	public List<User> findByNameNotNull();
	

	// Pattern matching
	public List<User> findByNameLike(String name);
	public List<User> findByNameNotLike(String name);
	public List<User> findByNameStartingWith(String name);
	public List<User> findByNameEndingWith(String name);
	public List<User> findByNameContaining(String name);
	
	// Negation
	public List<User> findByNameNot(String name);
	
	// IN / NOT IN
	public List<User> findByNameIn(List<String> name);
	public List<User> findByNameNotIn(List<String> name);
	
	// Boolean checks (must be used with boolean fields, not String)
	public List<User> findByActiveTrue();
	public List<User> findByActiveIsTrue();
	public List<User>findByActiveFalse();
	public List<User> findByActiveIsFalse();
	
	// Ignore case
	public List<User> findByNameIgnoreCase(String name);
	
	// Limiting
	public List<User> findTop5ByName(String name);
	public User findFirstByName(String name);
	
	// Distinct
	public List<User> findDistinctByName(String name);
}
