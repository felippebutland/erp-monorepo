package com.backend.erpspring.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.erpspring.Entities.ERoleEntity;
import com.backend.erpspring.Entities.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, UUID>{
    Optional<RoleEntity> findByName(ERoleEntity name);
}
