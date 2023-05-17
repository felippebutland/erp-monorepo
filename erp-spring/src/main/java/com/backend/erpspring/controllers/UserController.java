package com.backend.erpspring.controllers;

import java.util.List;
import java.util.UUID; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.erpspring.Entities.UserEntity;
import com.backend.erpspring.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {
  
  @Autowired
  private UserRepository userRepository;

  @GetMapping
  public List<UserEntity> getAllUsers() {
    return userRepository.findAll();
  }

  @PostMapping
  public void createUser(UserEntity user) {
    userRepository.save(user);
  }

  @GetMapping("/{id}")
  public UserEntity getUser(UUID id) {
    return userRepository.findById(id).orElseThrow();
  }
}
