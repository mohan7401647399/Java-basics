package org.example.springmysqljson.service;

import lombok.RequiredArgsConstructor;
import org.example.springmysqljson.entity.User;
import org.example.springmysqljson.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }
}