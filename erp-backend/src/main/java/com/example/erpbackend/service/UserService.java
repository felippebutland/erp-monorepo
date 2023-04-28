package com.example.erpbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.erpbackend.Entities.UserEntity;
import com.example.erpbackend.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;        
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity createUser(UserEntity user) {
        Object userExists = userRepository.findByEmail(user.getEmail());

        if (((UserEntity) userExists).getId() != null){
            return null;
        }

        Object userCreated = userRepository.createUser(user);

        return userCreated != null ? (UserEntity) userCreated : null;
    }

    public UserEntity getUserById(Long id) {
        return userRepository.findById(id);
    }
    
    public UserEntity updateUser(UserEntity user) {
        Object userExists = userRepository.findByEmail(user.getEmail());

        if (((UserEntity) userExists).getId() == null){
            return null;
        }

        Object userUpdated = userRepository.updateUser(user);

        return userUpdated != null ? (UserEntity) userUpdated : null;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    
}
