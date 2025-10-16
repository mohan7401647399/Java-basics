package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.StudentDTO;
import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;

	// convert -> Entity to DTO
	private StudentDTO EntityToDTO(Student student) {
		StudentDTO dto = new StudentDTO();

		dto.setStudentId(student.getStudentId());
		dto.setStudentName(student.getStudentName());

		if (student.getCourses() != null) {
			dto.setCourseIds(student.getCourses().stream().map(Course::getCourseId).toList());
		}
		return dto;
	}

	// create a student
	public StudentDTO createStudent(StudentDTO dto) {
		Student s1 = new Student();

		s1.setStudentName(dto.getStudentName());

		if (dto.getCourseIds() != null) {
			List<Course> courses = courseRepository.findAllById(dto.getCourseIds());
			s1.setCourses(courses);
		}
		Student savedStudent = studentRepository.save(s1);

		return EntityToDTO(savedStudent);
	}

	// get all students
	public List<StudentDTO> getAllStudents() {
		return studentRepository.findAll().stream().map(this::EntityToDTO).toList();
	}

	// get course
	public StudentDTO getStudent(int id) {
		Student student = studentRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("student not found " + id));
		return EntityToDTO(student);
	}

	// delete course
	public String deleteStudent(int id) {
		studentRepository.deleteById(id);
		return "Student has been deleted";
	}

	// update course
	public StudentDTO updateStudent(int id, StudentDTO dto) {
		Student student = studentRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("no student id found " + id));
		student.setStudentName(dto.getStudentName());

		if (dto.getCourseIds() != null) {
			List<Course> courses = courseRepository.findAllById(dto.getCourseIds());
			student.setCourses(courses);
		}

		Student updatedStudent = studentRepository.save(student);
		return EntityToDTO(updatedStudent);
	}
}
