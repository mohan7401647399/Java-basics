package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	@GetMapping("/{id}")
	public Employee getById(@PathVariable int id) {
		return employeeRepository.findById(id).orElseThrow();
	}

	@PostMapping("/create")
	public Employee create(@RequestBody Employee e) {
		return employeeRepository.save(e);
	}

	@PutMapping("/{id}")
	public Employee update(@PathVariable int id, @RequestBody Employee emp) {
		Employee existing = employeeRepository.findById(id).orElse(null);
		if (existing != null) {
			existing.setName(emp.getName());
			existing.setRole(emp.getRole());
			return employeeRepository.save(existing);
		}
		return null;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		employeeRepository.deleteById(id);
	}
}
