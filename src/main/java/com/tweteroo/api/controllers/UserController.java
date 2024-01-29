package com.tweteroo.api.controllers;

import com.tweteroo.api.repository.UserRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import java.util.Optional;

import java.util.List;
// import java.util.ArrayList;

import com.tweteroo.api.models.UserModel;

@RestController
@RequestMapping("/users")
public class UserController {

    final UserRepository userRepository;

    UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<UserModel> getUsers() {
        return userRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public List<UserModel> getUserById(@PathVariable("id") Long id) {
        List<UserModel> user = userRepository.findAll();
        if(user != null) return user;
        return null;
}
}
