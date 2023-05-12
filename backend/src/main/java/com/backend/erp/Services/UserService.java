package com.backend.erp.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.erp.Entities.UserEntity;
import com.backend.erp.Repositories.UserRepository;

@Service
public class UserService {


  @Autowired
  private UserRepository userRepository;

  public List<UserEntity> getAllUsers() {
    List<UserEntity> users = new ArrayList<>();
    userRepository.findAll().forEach(users::add);
    return users;
  }
}
