package association.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import association.dto.UserDTO;
import association.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public UserDTO createUser(@RequestBody UserDTO userDTO) {
		return userService.createUser(userDTO);
	}

	@GetMapping("/getAll")
	public List<UserDTO> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/get/{id}")
	public UserDTO getUser(@PathVariable int id) {
		return userService.getUserById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
		return "User has been deleted ";
	}

	@PutMapping("/update/{id}")
	public UserDTO updateUser(@PathVariable int id, @RequestBody UserDTO userDTO) {
		return userService.updateUser(id, userDTO);
	}
}
