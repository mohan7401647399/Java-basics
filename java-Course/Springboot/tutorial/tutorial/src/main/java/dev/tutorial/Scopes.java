package dev.tutorial;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
@Component
//	default -> @Scope("singleton")
public class Scope {
	int age;
	
	public void show() {
		System.out.println("Scope method!!!");
	}
}
*/



/*
@Component
@Scope("singleton")
public class Scopes {
	int age;

	public void show() {
		System.out.println("Scope method!!!");
	}
}
*/




@Component
@Scope("prototype")
public class Scopes {
	int age;

	public void show() {
		System.out.println("Scope method!!!");
	}
}