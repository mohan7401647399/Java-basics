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

import com.example.demo.DTO.CourseDTO;
import com.example.demo.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@PostMapping("/create")
	public CourseDTO createCourse(@RequestBody CourseDTO dto) {
		return courseService.createCourse(dto);
	}

	@GetMapping("/getAll")
	public List<CourseDTO> getAllCourses() {
		return courseService.getAllCourses();
	}

	@GetMapping("/get/{id}")
	public CourseDTO getCourse(@PathVariable int id) {
		return courseService.getCourse(id);
	}

	@DeleteMapping("/delete{id}")
	public String deleteMapping(@PathVariable int id) {
		return courseService.deleteCourse(id);
	}

	@PutMapping("/update/{id}")
	public CourseDTO updateCourse(@PathVariable int id, @RequestBody CourseDTO dto) {
		return courseService.updateCourse(id, dto);
	}
}
