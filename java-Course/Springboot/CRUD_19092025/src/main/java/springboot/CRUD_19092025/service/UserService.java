package springboot.CRUD_19092025.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.CRUD_19092025.model.UserModel;
import springboot.CRUD_19092025.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;

	public List<UserModel> getAllUsers() {
		return userRepo.findAll();
	}

	public UserModel getByUserId(int userId) {
		return userRepo.findById(userId).orElse(new UserModel());
	}

	public void createUser(UserModel usermodel) {
		userRepo.save(usermodel);
	}

	public void updateUser(UserModel usermodel) {
		userRepo.save(usermodel);
	}

	public void deleteUserById(int userId) {
		userRepo.deleteById(userId);
	}

	public void deleteAllUsers() {
		userRepo.deleteAll();
	}

	public List<UserModel> getUsersByTechnology(String technology) {
		return userRepo.findByTechnology(technology);
	}

	public List<UserModel> getUsersByNameAndTechnology(String name, String technology) {
		return userRepo.findByNameAndTechnology(name, technology);
	}

}
