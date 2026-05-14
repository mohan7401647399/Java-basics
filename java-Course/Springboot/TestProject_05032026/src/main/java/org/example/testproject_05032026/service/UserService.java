package org.example.testproject_05032026.service;

import java.util.List;
import java.util.Optional;

import org.example.testproject_05032026.Repository.UserRepo;
import org.example.testproject_05032026.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    // ✅ GET ALL USERS
    public List<UserModel> getAllUsers() {
        return userRepo.findAll();
    }

    // ✅ GET USER BY ID
    public Optional<UserModel> getByUserId(int userId) {
        return userRepo.findById(userId);
    }

    // ✅ CREATE USER
    public UserModel createUser(UserModel user) {
        return userRepo.save(user);
    }

    // ✅ UPDATE USER
    public UserModel updateUser(int userId, UserModel updatedUser) {
        Optional<UserModel> existingUser = userRepo.findById(userId);

        if (existingUser.isPresent()) {
            UserModel user = existingUser.get();
            user.setName(updatedUser.getName());
            user.setAge(updatedUser.getAge());
            return userRepo.save(user);
        } else {
            throw new RuntimeException("User not found with id: " + userId);
        }
    }

    // ✅ DELETE ALL USERS
    public String deleteAllUsers() {
        userRepo.deleteAll();
        return "All users deleted successfully";
    }

    // ✅ DELETE USER BY ID
    public String deleteUserById(int userId) {
        if (userRepo.existsById(userId)) {
            userRepo.deleteById(userId);
            return "User deleted with id: " + userId;
        } else {
            return "User not found with id: " + userId;
        }
    }
}