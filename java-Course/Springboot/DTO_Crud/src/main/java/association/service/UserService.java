package association.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import association.dto.UserDTO;
import association.model.UserModel;
import association.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	// Entity to DTO
	private UserDTO convertToDTO(UserModel user) {
		UserDTO dto = new UserDTO();
		
		dto.setUserId(user.getUserId());
		dto.setName(user.getName());
		
		return dto;
	}
	
	// create user
	public UserDTO createUser(UserDTO userDTO) {
		//	userModel object
		UserModel user = new UserModel();

		user.setUserId(userDTO.getUserId());
		user.setName(userDTO.getName());

		userRepository.save(user);
		
		userDTO.setUserId(user.getUserId());
		
		return userDTO;
	}

	//	get all users
	public List<UserDTO> getAllUsers() {
		return userRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
	}
	
	//	get user by id
	public UserDTO getUserById(int id) {
		//	get UserModel
		UserModel user = userRepository.findById(id).orElseThrow();
		
		return convertToDTO(user);
	}
	
	//	delete user
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
	
	//	update user
	public UserDTO updateUser(int id, UserDTO userDTO) {
		//	get userModel
		UserModel user = userRepository.findById(id).orElseThrow();
		
		user.setName(userDTO.getName());
		
		userRepository.save(user);
		
		return convertToDTO(user);
	}

}
