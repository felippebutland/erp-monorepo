package com.backend.erpspring.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.erpspring.Entities.UserEntity;;

public interface UserRepository extends JpaRepository<UserEntity, UUID>{
    Optional<UserEntity> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
