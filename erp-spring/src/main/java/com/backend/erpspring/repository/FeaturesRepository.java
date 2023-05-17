package com.backend.erpspring.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.erpspring.Entities.FeaturesEntity;

@Repository
public interface FeaturesRepository extends JpaRepository<FeaturesEntity, UUID>{
  
}
