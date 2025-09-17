package dev.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class School {
	
	@Autowired
	@Qualifier("student")
	private Loose_Coupling lcu;
	
	public void show() {
		lcu.write();
	}
}
