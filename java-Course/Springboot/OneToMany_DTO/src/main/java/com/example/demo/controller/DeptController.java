package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.DeptDTO;
import com.example.demo.service.DeptService;

@RestController
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private DeptService deptService;

	@PostMapping("/create")
	public DeptDTO createDept(@RequestBody DeptDTO dto) {
		return deptService.createDept(dto);
	}

	@GetMapping("/get/{id}")
	public DeptDTO getDept(@PathVariable int id) {
		return deptService.getDept(id);
	}

	@GetMapping("/getAll")
	public List<DeptDTO> getAllDepts() {
		return deptService.getAllDepts();
	}
}
