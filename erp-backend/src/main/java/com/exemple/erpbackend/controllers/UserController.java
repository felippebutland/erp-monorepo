package com.exemple.erpbackend.controllers;

import com.example.erpbackend.Entities.UserEntity;
import com.example.erpbackend.service.UserService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> getUsers() {
        return (List<UserEntity>) userService.getAllUsers();
    }

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity user) {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public UserEntity getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public UserEntity updateUser(@PathVariable Long id, @RequestBody UserEntity userRequest) {
        UserEntity user = userService.getUserById(id);

        if (user == null) {
            throw new ResourceNotFoundException("User not found with id " + id);
        }

        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());

        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        UserEntity user = userService.getUserById(id);

        if (user == null) {
            throw new ResourceNotFoundException("User not found with id " + id);
        }

        userService.deleteUser(id);

        return ResponseEntity.ok().build();
    }

}
