package springboot.CRUD_19092025.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.CRUD_19092025.model.UserModel;
import springboot.CRUD_19092025.service.UserService;

@RestController
class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/users")
	public List<UserModel> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/user/{id}")
	public UserModel getByUserId(@PathVariable int id) {
		return userService.getByUserId(id);
	}

	@PostMapping("/create")
	public String createUser(@RequestBody UserModel usermodel) {
		userService.createUser(usermodel);
		return "user created";
	}

	@PutMapping("/update")
	public String updateUser(@RequestBody UserModel usermodel) {
		userService.updateUser(usermodel);
		return "user updated";
	}

	@DeleteMapping("/delete/{id}")
	public String deleteUserById(@PathVariable int id) {
		userService.deleteUserById(id);
		return "user deleted";
	}

	@DeleteMapping("/deleteAll")
	public String deleteAllUsers() {
		userService.deleteAllUsers();
		return "All users deleted";
	}

	@GetMapping("/users/technology/{tech}")
	public List<UserModel> findUserByTechnology(@PathVariable("tech") String technology) {
		return userService.getUsersByTechnology(technology);
	}

	@PostMapping("/users/filter")
	public List<UserModel> findUserByNameAndTech(@Param("name") String name, @Param("technology") String technology) {
		return userService.getUsersByNameAndTechnology(name, technology);
	}
}
