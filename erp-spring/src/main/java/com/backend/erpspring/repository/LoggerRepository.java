package com.backend.erpspring.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.erpspring.Entities.LoggerEntity;

@Repository
public interface LoggerRepository extends JpaRepository<LoggerEntity, UUID> {
    
}
