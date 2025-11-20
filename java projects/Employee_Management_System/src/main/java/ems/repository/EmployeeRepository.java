package ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ems.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	List<Employee> findByActiveTrue();
	
	List<Employee> findByDepartment(String department);
	
	List<Employee> findByEmail(String email);
	
	List<Employee> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);
}
