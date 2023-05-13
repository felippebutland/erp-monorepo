package com.backend.erpspring.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.erpspring.Entities.CustomersEntity;

@Repository
public interface CustomersRepository extends JpaRepository<CustomersEntity, UUID> {
    
}