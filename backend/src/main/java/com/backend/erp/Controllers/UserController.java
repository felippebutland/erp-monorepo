package com.backend.erp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.erp.Services.UserService;

import com.backend.erp.Entities.*;

@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping
  public List<UserEntity> getAllUsers() {
    return userService.getAllUsers();
  }
}
