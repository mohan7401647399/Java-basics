package org.example.testproject_05032026.service;

import org.example.testproject_05032026.Repository.UserRepo;
import org.example.testproject_05032026.model.UserModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserServiceTest {

    @Mock
    private UserRepo userRepo;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
        System.out.println("Before Each");
    }

    @Test
    void testGetAllUsers() {

        List<UserModel> users = Arrays.asList(
                new UserModel(1, "Mohan", 30),
                new UserModel(2, "Ravi", 25)
        );

        when(userRepo.findAll()).thenReturn(users);

        List<UserModel> result = userService.getAllUsers();

        assertEquals(2, result.size());
        assertEquals("Mohan", result.get(0).getName());
        assertEquals(30, result.get(0).getAge());

        verify(userRepo, times(1)).findAll();

        System.out.println("After testGetAllUsers test");
    }

    @Test
    void testGetByUserId() {
        UserModel user = new UserModel(1, "Mohan", 30);

        when(userRepo.findById(1)).thenReturn(Optional.of(user));

        UserModel result = userService.getByUserId(1).orElseThrow();

        assertEquals("Mohan", result.getName());

        verify(userRepo, times(1)).findById(1);

        System.out.println("After testGetByUserId test");
    }
}
