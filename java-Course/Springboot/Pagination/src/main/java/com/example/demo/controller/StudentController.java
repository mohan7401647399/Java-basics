package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

//	@GetMapping("/page")
//	public Page<Student> getStudentPage(@RequestParam int page, @RequestParam int size) {
//		return studentService.getStudentWithPagination(page, size);
//	}

	@GetMapping("/page")
	public Page<Student> getStudentPage(@RequestParam int page, @RequestParam int size, @RequestParam(defaultValue = "id") String sortBy) {
		return studentService.getStudentWithPaginationAndSorting(page, size, sortBy);
	}
}
