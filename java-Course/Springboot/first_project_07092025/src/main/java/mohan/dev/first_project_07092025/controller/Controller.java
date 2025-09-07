package mohan.dev.first_project_07092025.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mohan.dev.first_project_07092025.entity.UserEntity;
import mohan.dev.first_project_07092025.exceptions.ResouceNotFoundException;
import mohan.dev.first_project_07092025.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class Controller {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<UserEntity> getUser() {
//		return Arrays.asList(new User(1L, "Mohan", "mohan@gmail.com"), new User(2L, "John", "john@gmail.com"), new User(3L, "james", "james@gmail.com"));
		return userRepository.findAll();
	}

	@PostMapping
	public UserEntity createUser(@RequestBody UserEntity user) {
		System.out.println("User data is : " + user.getName() + ", " + user.getEmail());
		return userRepository.save(user);
	}

	@GetMapping("/{id}")
	public UserEntity getUserById(@PathVariable Long id) {
		System.out.println("User data : " + id);
		return userRepository.findById(id)
				.orElseThrow(() -> new ResouceNotFoundException("user not found with this id : " + id));
	}

	@PutMapping("/{id}")
	public UserEntity updateUser(@PathVariable Long id, @RequestBody UserEntity user) {
		UserEntity userData = userRepository.findById(id)
				.orElseThrow(() -> new ResouceNotFoundException("user not found with this id : " + id));
		userData.setName(user.getName());
		userData.setEmail(user.getEmail());
		return userRepository.save(userData);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Long id) {
		UserEntity userData = userRepository.findById(id)
				.orElseThrow(() -> new ResouceNotFoundException("user not found with this id : " + id));
		userRepository.delete(userData);
		return ResponseEntity.ok().build();
	}
}
