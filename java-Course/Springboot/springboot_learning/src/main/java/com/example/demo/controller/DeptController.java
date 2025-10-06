package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.DeptService;

@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;

	@PostMapping("/dept/create")
	public Department createDept(@RequestBody Department dept) {
		return deptService.createDept(dept);
	}

	@GetMapping("/dept")
	public List<Department> getAllDepts() {
		return deptService.getAllDepartment();
	}

	@GetMapping("/dept/{id}")
	public Department getDepartment(@PathVariable Long id) {
		return deptService.getDepartmentById(id);
	}

}
