package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CourseRegistryRepo;
import com.example.demo.Repository.CourseRepository;
import com.example.demo.model.Course;
import com.example.demo.model.CourseRegistry;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private CourseRegistryRepo courseRegistryRepo;

	// get all courses
	public List<Course> availableCourses() {
		return courseRepository.findAll();
	}

	// get all enrolled students
	public List<CourseRegistry> enrolledStudents() {
		return courseRegistryRepo.findAll();
	}

	// create course
	public void createCourse(String name, String email, String courseName) {
		CourseRegistry courseRegistry = new CourseRegistry(name, email, courseName);
		courseRegistryRepo.save(courseRegistry);
	}

}
