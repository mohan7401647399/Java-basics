package association.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import association.Service.UserService;
import association.model.UserModel;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public UserModel createUser(@RequestBody UserModel userModel) {
		return userService.createUser(userModel);
	}
	
	@PostMapping("/create/dept/{departmentId}")
	public UserModel createUserWithDept(@PathVariable int departmentId, @RequestBody UserModel userModel) {
		return userService.createUserWithDept(userModel, departmentId);
	}
	
	@PostMapping("/assign/course/{id}")
	public UserModel assignCourseToUser(@PathVariable int id, @RequestBody List<Integer> courseIds) {
		return userService.createUserWithCourse(id, courseIds);
	}

	@GetMapping("/get/{userId}")
	public UserModel getUser(@PathVariable int userId) {
		return userService.getUser(userId);
	}

	@GetMapping("/getAll")
	public List<UserModel> getAllUsers() {
		return userService.getAllUsers();
	}

}
