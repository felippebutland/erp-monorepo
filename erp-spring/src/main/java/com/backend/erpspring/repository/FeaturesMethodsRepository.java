package com.backend.erpspring.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.erpspring.Entities.FeaturesMethodsEntity;

@Repository
public interface FeaturesMethodsRepository extends JpaRepository<FeaturesMethodsEntity, UUID> {
  
}
