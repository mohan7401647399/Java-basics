package dev.tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Controller {
	@GetMapping()
	public String getHomePage() {
		return "Home Page";
	}
	
	@GetMapping("user")
	public String getUser() {
		return "User Page..!";
	}
	@GetMapping("/about")
	public String getAbout() {
		return "About Page";
	}
}
