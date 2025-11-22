package ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ems.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	// Fetch all employees whose 'active' field is true
	List<Employee> findByActiveTrue();
	
	// Fetch all employees belonging to a specific department
	List<Employee> findByDepartment(String department);
	
	// Fetch employee(s) by their email address
	List<Employee> findByEmail(String email);
	
	// Search employees by matching part of their first name or last name
	List<Employee> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);
}