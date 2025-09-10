package springboot.second_demo_08092025.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/user")
	public String getUser() {
		return "Hello java world!!!";
	}

	@GetMapping("/user/para")
	public String getUserPara(String name) {
		return "Entered name is " + name;
	}
}