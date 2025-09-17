package dev.tutorial;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Teacher implements Loose_Coupling {
	@Override
	public void write() {
		System.out.println("write method in Teacher class");
	}
}
