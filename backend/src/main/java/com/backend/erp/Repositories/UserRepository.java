package com.backend.erp.Repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.erp.Entities.UserEntity;;

public interface UserRepository extends JpaRepository<UserEntity, UUID>{
  
}
