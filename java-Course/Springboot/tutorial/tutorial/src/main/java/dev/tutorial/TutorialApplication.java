package dev.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TutorialApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TutorialApplication.class, args);

		//	ApplicationContext
//		Student s = new Student();				-> core java object
		Student s = context.getBean(Student.class); // Spring Boot way (object managed by Spring Container)
		s.show();

		//	scopes
		Scopes s1 = context.getBean(Scopes.class);
		s1.age = 10;
		s1.show();

		Scopes s2 = context.getBean(Scopes.class);
		s2.show();

		System.out.println(s1.age + " : " + s2.age);
	}
}