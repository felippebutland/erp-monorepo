package com.example.erpbackend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.erpbackend.Entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findByEmail(String email);

    List<UserEntity> findAll();

    void deleteById(Long id);

    default UserEntity updateUser(UserEntity user) {
        if (user.getId() == null) {
            throw new IllegalArgumentException("User id cannot be null");
        }

        if (!existsById(user.getId())) {
            throw new IllegalArgumentException("User does not exist");
        }

        return save(user);
    }

    public default UserEntity createUser(UserEntity user) {
      return save(user);
    }

    public default UserEntity findById(Long id) {
      return findById(id).orElse(null);
    }

}
