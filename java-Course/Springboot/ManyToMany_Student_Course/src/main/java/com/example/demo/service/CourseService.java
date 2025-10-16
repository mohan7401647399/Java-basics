package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.CourseDTO;
import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.StudentRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private StudentRepository studentRepository;

	// convert -> Entity to DTO
	private CourseDTO EntityToDTO(Course course) {

		CourseDTO dto = new CourseDTO();

		dto.setCourseId(course.getCourseId());
		dto.setCourseName(course.getCourseName());

		if (course.getStudents() != null) {
			dto.setStudentIds(course.getStudents().stream().map(Student::getStudentId).toList());
		}
		return dto;
	}

	// create a course
	public CourseDTO createCourse(CourseDTO dto) {
		Course c1 = new Course();

		c1.setCourseName(dto.getCourseName());

		if (dto.getStudentIds() != null) {
			List<Student> students = studentRepository.findAllById(dto.getStudentIds());
			c1.setStudents(students);
		}
		Course savedCourse = courseRepository.save(c1);
		return EntityToDTO(savedCourse);
	}

	// get All Courses
	public List<CourseDTO> getAllCourses() {
		return courseRepository.findAll().stream().map(this::EntityToDTO).toList();
	}

	// get course
	public CourseDTO getCourse(int id) {
		Course course = courseRepository.findById(id).orElseThrow(() -> new RuntimeException("course not found " + id));
		return EntityToDTO(course);
	}

	// delete course
	public String deleteCourse(int id) {
		courseRepository.deleteById(id);
		return "Course has been deleted";
	}

	// update course
	public CourseDTO updateCourse(int id, CourseDTO dto) {
		Course course = courseRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("no course id found " + id));

		course.setCourseName(dto.getCourseName());

		if (dto.getStudentIds() != null) {
			List<Student> students = studentRepository.findAllById(dto.getStudentIds());
			course.setStudents(students);
		}

		Course savedCourse = courseRepository.save(course);
		return EntityToDTO(savedCourse);
	}
}
