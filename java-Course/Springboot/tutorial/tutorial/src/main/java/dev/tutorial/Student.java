package dev.tutorial;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
@Component
public class Student {
	public void show() {
		System.out.println("show method in Student class");
	}
}
*/


@Component
@Primary
public class Student implements Loose_Coupling {
	@Override
	public void write() {
		System.out.println("write method in Student class");
	}
}
