package dev.tutorial.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import dev.tutorial.model.Student;

@Service
public class StudentService {

	List<Student> students = new ArrayList<>(Arrays.asList(new Student(1, "mohan", "science"),
			new Student(2, "james", "commerce"), new Student(3, "mickel", "maths")));

	public List<Student> getStudent() {
		return students;
	}

	public Student getStudentById(int id) {
		int idx = 0;
		boolean found = false;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == id) {
				idx = i;
				found = true;
				break;
			}
		}
		if (found)
			return students.get(idx);
		else {
			return new Student(0, "", "");
		}
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public String updateStudent(Student student) {
		int index = 0;
		boolean found = false;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == student.getId()) {
				index = i;
				found = true;
				break;
			}
		}
		if (!found) {
			return "student doesn't exist";
		} else {
			students.set(index, student);
			return "student updated";
		}
	}

	public String deleteStudent(int id) {
		int index = 0;
		boolean found = false;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == id) {
				index = i;
				found = true;
				break;
			}
		}
		if (found) {
			students.remove(index);
			return "student deleted";
		} else {
			return "student doesn't found";
		}
	}
}
