package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.UserRepo;
import models.UserModel;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;

	public List<UserModel> getAllUsers() {
		return userRepo.findAll();
	}

}
