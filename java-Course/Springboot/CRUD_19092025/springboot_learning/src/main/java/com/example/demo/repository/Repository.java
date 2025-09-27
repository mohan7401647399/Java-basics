package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;

import jakarta.transaction.Transactional;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<User, Integer> {

	// custom method
	public User findByName(String name);

	// Native query
	@Query(value = "select * from user where name =:name and age =:age", nativeQuery = true)
	public List<User> findByNameAndAge(@RequestParam("name") String name, @RequestParam("age") int age);

	// Native query
	@Query(value = "select * from user where name =:name or age =:age", nativeQuery = true)
	public List<User> findByNameAge(@RequestParam("name") String name, @RequestParam("age") int age);

	// HQL - hybernate query language
//	@Query("from User u where u.age > :age")
//	public List<User> getByAge(int age);

	@Query("from User u where u.age > :myAge")
	public List<User> getByAge(@Param("myAge") int age);

	@Query("select u.name from User u where u.id = :id")
	public String getUserById(@Param("id") int id);
	
	
	@Transactional
	@Modifying
	@Query("update User u set u.salary =:salary where u.id =:id")
	public int getAllUserQueries(@Param("id") int id, @Param("salary") int salary);
	
	
	/*
	Write an HQL query to fetch all employees.
		@Query("from User u")
		public List<User> getAllUserQueries();

	Write an HQL query to fetch employees whose salary is greater than 50,000.
		@Query("from User u where u.salary > :salary")
		public List<User> getAllUserQueries(@Param("salary") int salary);

	Write an HQL query to fetch employees with a specific department id.
		@Query("from User u where u.age = :age")
		public User getAllUserQueries(@Param("age") int age);

	Write an HQL query to fetch employees whose name starts with “A”.
		@Query("from User u where u.name like 'A%'")
		public List<User> getAllUserQueries();

	Write an HQL query to fetch employees sorted by salary in descending order.
		@Query("from User u order by u.salary desc")
		public List<User> getAllUserQueries();

	Write an HQL query to count the total number of employees.
		@Query("select count(u) from User u")
		public int getAllUserQueries();

	Write an HQL query to fetch employees with a salary between 30,000 and 60,000.
		@Query("from User u where u.salary between 30000 and 60000")
		public List<User> getAllUserQueries();

	Write an HQL query to fetch employees whose age is greater than 30 and less than 50.
		@Query("from User u where u.age > 30 and u.age < 50")
		public List<User> getAllUserQueries();

	Write an HQL query to fetch the maximum salary from the employee table.
		@Query("select max(u.salary) from User u")
		public int getAllUserQueries();

	Write an HQL query to fetch employees having null in the manager field.
		@Query("from User u where u.name is null")
		public List<User> getAllUserQueries();

	Write an HQL query to update the salary of an employee based on their id.
		@Transactional
		@Modifying
		@Query("update User u set u.salary =:salary where u.id =:id")
		public int getAllUserQueries(@Param("id") int id, @Param("salary") int salary);

	Write an HQL query to delete an employee based on their id.
		@Transactional
		@Modifying
		@Query("delete from User u where u.id =:id")
		public int getAllUserQueries(@Param("id") int id);

	Write an HQL query to fetch employees whose name contains the letter “e”.
		@Query("from User u where u.name like '%e%'")
		public List<User> getAllUserQueries();

	Write an HQL query to fetch employees grouped by department and count them.
		@Query("select u.age, count(u) from User u group by u.age")
		public List<Object[]> getAllUserQueries();	

	Write an HQL query to fetch only distinct job titles from the employee table.
		@Query("select distinct u.name from User u")
		public List<String> getAllUserQueries();
	*/
}
