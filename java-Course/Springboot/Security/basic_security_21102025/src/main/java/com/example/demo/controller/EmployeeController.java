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
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}
	
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee emp) {
		return employeeService.createEmployee(emp);
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee emp) {
		return employeeService.updateEmployee(id, emp);
	}
	
	@DeleteMapping("/delete")
	public String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployee(id);
	}
	
}
