package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;
import com.example.demo.model.CourseRegistry;
import com.example.demo.service.CourseService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/allcourses")
	public List<Course> availableCourses() {
		return courseService.availableCourses();
	}

	@GetMapping("/enrolled")
	public List<CourseRegistry> enrolledStudents() {
		return courseService.enrolledStudents();
	}

	@PostMapping("/create")
	public String createCourse(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("courseName") String courseName) {
		courseService.createCourse(name, email, courseName);
		return "enrolled! " + name + " student for " + courseName;
	}
}
