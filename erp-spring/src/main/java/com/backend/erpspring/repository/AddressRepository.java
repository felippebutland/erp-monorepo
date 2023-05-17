package com.backend.erpspring.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.erpspring.Entities.AddressEntity;
import com.backend.erpspring.Enums.AddressEnum;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, UUID> {

  AddressEntity findByType(AddressEnum type);
  
}
