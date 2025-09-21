package userController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import models.UserModel;
import service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<UserModel> getAllUsers() {
		return userService.getAllUsers();
	}

//	@GetMapping("/users/{id}")
//	public String getByUserId() {
//		userService.getByUserId();
//	}
//
//	@PostMapping("/create")
//	public String createUser() {
//		userService.createUser();
//	}
//
//	@PutMapping("/update")
//	public String updateUser() {
//		userService.updateUser();
//	}
//
//	@DeleteMapping("/deleteAll")
//	public String deleteAllUsers() {
//		return userService.deleteAllUsers();
//	}
//
//	@DeleteMapping("/delete/{id}")
//	public String deleteUserById() {
//		return userService.deleteUserById();
//	}
}
