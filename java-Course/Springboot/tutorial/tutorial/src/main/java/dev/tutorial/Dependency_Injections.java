package dev.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dependency_Injections {

	/*
	 * @Autowired Student student; // field injection
	 */

	/*
	 * Student student;
	 * 
	 * @Autowired public void setStudent(Student student) { // setter injection
	 * System.out.println("setter injection is called..."); this.student = student;
	 * }
	 */

	Student student;

	@Autowired
	public Dependency_Injections(Student student) { // constructor injection
		System.out.println("constructor injection is called");
		this.student = student;
	}

	public void show() {
		System.out.println("show method in Dependency_Injections class");
	}

	public void callClass() {
		student.show();
	}

}
