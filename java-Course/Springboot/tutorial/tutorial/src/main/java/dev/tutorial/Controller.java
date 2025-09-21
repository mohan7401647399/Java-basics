package dev.tutorial;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class User {
	private int userId;
	private String name;

	public User(int userId, String name) {
		this.userId = userId;
		this.name = name;
	}

	public int getId() {
		return userId;
	}

	public String getName() {
		return name;
	}
}

@RestController
@RequestMapping("/home")
public class Controller {

	List<User> userList = new ArrayList<>();

	@GetMapping()
	public String getHomePage() {
		return "Home Page";
	}

	@GetMapping("/users")
	public List<User> getUser() {
		return userList;
	}

	@GetMapping("/about")
	public String getAbout() {
		return "About Page";
	}

	@PostMapping("/adduser")
	public String addUser(@RequestBody User user) {
		userList.add(user);
		return "user added successfully";
	}

	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable int id) {
		int idx = 0;
		boolean found = false;
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getId() == id) {
				idx = i;
				found = true;
			}
		}
		if (!found) {
			return new User(0, "");
		} else {
			System.out.println("Name is " + userList.get(idx).getName() + " and id is " + userList.get(idx).getId());
			return userList.get(idx);
		}
	}
}
