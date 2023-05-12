package com.example.erpbackend.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.erpbackend.Entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);

    void deleteById(Long id);

    Object findAll(UserEntity user);

    Object updateUser(Optional<UserEntity> user);

    Object createUser(UserEntity user);

}
