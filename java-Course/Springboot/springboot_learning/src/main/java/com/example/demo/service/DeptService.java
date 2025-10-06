package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Department;
import com.example.demo.model.User;
import com.example.demo.repository.DeptRepository;

@org.springframework.stereotype.Service
public class DeptService {

	@Autowired
	private DeptRepository deptRepo;

	// create dept
	public Department createDept(Department dept) {
		// link department to each employee before saving
		if (dept.getUsers() != null) {
			for (User user : dept.getUsers()) {
				user.setDepartment(dept);
			}
		}
		return deptRepo.save(dept);
	}

	// get all dept
	public List<Department> getAllDepartment() {
		return deptRepo.findAll();
	}
	
	//	get by id
	public Department getDepartmentById(Long deptId) {
		return deptRepo.findById(deptId).orElseThrow(() -> new RuntimeException("Department not found"));
	}
}
