package org.example.kafkabasics.controller;

import lombok.RequiredArgsConstructor;
import org.example.kafkabasics.model.User;
import org.example.kafkabasics.producer.UserProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserProducer userProducer;

    @PostMapping
    public String register(@RequestBody User user){
        userProducer.sendMessage(user);

        return "User registered successfully";
    }
}
