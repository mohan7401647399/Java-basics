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

import com.example.demo.DTO.StudentDTO;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/create")
	public StudentDTO createStudent(@RequestBody StudentDTO dto) {
		return studentService.createStudent(dto);
	}

	@GetMapping("/getAll")
	public List<StudentDTO> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/get/{id}")
	public StudentDTO getStudent(@PathVariable int id) {
		return studentService.getStudent(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studentService.deleteStudent(id);
	}
	
	@PutMapping("/update/{id}")
	public StudentDTO updateStudent(@PathVariable int id, @RequestBody StudentDTO dto) {
		return studentService.updateStudent(id, dto);
	}
}