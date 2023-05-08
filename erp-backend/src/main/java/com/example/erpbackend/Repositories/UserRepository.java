package com.example.erpbackend.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.erpbackend.Entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findByEmail(String email);

    List<UserEntity> findAll(UserEntity userEntity);

    void deleteById(Long id);

    default UserEntity updateUser(Optional<UserEntity> user) {
        if (user.get() == null) {
            throw new IllegalArgumentException("User id cannot be null");
        }

        if (!existsById(user.get())) {
            throw new IllegalArgumentException("User does not exist");
        }

        return saveAll(user);
    }

    boolean existsById(UserEntity userEntity);

    UserEntity saveAll(Optional<UserEntity> user);

    public default UserEntity createUser(UserEntity user) {
      return save(user);
    }

    public default Optional<UserEntity> findById(Long id) {
      return findById(id);
    }

}
