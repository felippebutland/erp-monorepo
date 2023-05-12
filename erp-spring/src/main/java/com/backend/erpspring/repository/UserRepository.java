package com.backend.erpspring.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.erpspring.Entities.UserEntity;;

public interface UserRepository extends JpaRepository<UserEntity, UUID>{

  List<UserEntity> getAllUsers();
  
}
