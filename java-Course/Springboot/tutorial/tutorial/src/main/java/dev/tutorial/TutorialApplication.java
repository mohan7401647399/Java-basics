package dev.tutorial;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
		/*
		 * ApplicationContext context = SpringApplication.run(TutorialApplication.class,
		 * args); // ApplicationContext // Student s = new Student(); -> core java
		 * object Student s = context.getBean(Student.class); // Spring Boot way (object
		 * managed by Spring Container) s.show();
		 * 
		 * // scopes Scopes s1 = context.getBean(Scopes.class); s1.age = 10; s1.show();
		 * 
		 * Scopes s2 = context.getBean(Scopes.class); s2.show();
		 * 
		 * System.out.println(s1.age + " : " + s2.age);
		 * 
		 * 
		 * // Dependency injection Dependency_Injections di =
		 * context.getBean(Dependency_Injections.class); di.show(); di.callClass(); //
		 * di.setStudent(null);
		 * 
		 * 
		 * 
		 * // Loose coupling
		 * 
		 * School s1 = context.getBean(School.class); s1.show();
		 * 
		 */

	}

	/*
	 * // runners
	 * 
	 * @Override public void run(ApplicationArguments args) throws Exception {
	 * System.out.println("run method from ApplicationRunner"); }
	 * 
	 * @Override public void run(String... args) throws Exception {
	 * System.out.println("run method from CommandLineRunner"); }
	
	@Bean
	public Runner getRunner() {
		return new Runner();
	}
	 */
}