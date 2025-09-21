package dev.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.tutorial.model.Student;
import dev.tutorial.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping("students")
	public List<Student> getAllStudents() {
		return studentService.getStudent();
	}

	@GetMapping("students/{id}")
	public Student getStudentById(@PathVariable("id") int studentId) {
		return studentService.getStudentById(studentId);
	}

	@PostMapping("students")
	public String addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
		return "student added";
	}

	@PutMapping("students")
	public String updateStudents(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}

	@DeleteMapping("students/{id}")
	public String deleteStudents(@PathVariable int id) {
		return studentService.deleteStudent(id);
	}

	@GetMapping("/user/{name}")
	public String test(@PathVariable(value = "name") String nme) {
		return "Entered name is " + nme;
	}

	@GetMapping("/message/{id}")
	public String test2(@PathVariable("id") int id) {
		return "Entered id number is " + id;
	}

	@GetMapping("/search")
	public String test3(@RequestParam("name") String e) {
		return "Entered query is " + e;
	}

	@GetMapping("/search2")
	public String test4(@RequestParam("name") String e, @RequestParam("age") int age) {
		return "Entered query is " + e + " and age is " + age;
	}

	@GetMapping("/search3")
	public String test5(@RequestParam("name") String e, @RequestParam(value = "age", required = false, defaultValue = "18") int age) {
		return "Entered query is " + e + " and age is " + age;
	}
}
