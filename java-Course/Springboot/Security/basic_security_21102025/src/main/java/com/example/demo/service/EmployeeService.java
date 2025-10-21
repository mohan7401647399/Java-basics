package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	// get all users from db
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	// get employee with ID
	public Employee getEmployee(int id) {
		return employeeRepository.findById(id).orElseThrow();
	}

	// create employee
	public Employee createEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}

	// update employee
	public Employee updateEmployee(int id, Employee emp) {
		Employee existingEmp = employeeRepository.findById(id).orElseThrow();
		if (existingEmp != null) {
			existingEmp.setName(emp.getName());
			existingEmp.setRole(emp.getRole());

			return employeeRepository.save(existingEmp);
		}
		return null;
	}

	// delete employee
	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return "Employee has been deleted";
	}
}
