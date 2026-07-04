package org.example.springmysqljson.controller;

import lombok.RequiredArgsConstructor;
import org.example.springmysqljson.entity.User;
import org.example.springmysqljson.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping
    public User save(@RequestBody User user) {
        return service.save(user);
    }
}
