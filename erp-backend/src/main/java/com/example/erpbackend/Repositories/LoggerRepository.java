package com.example.erpbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.erpbackend.Entities.LoggerEntity;

@Repository
public interface LoggerRepository extends CrudRepository<LoggerEntity, Long> {
    @Override
    <S extends LoggerEntity> S save(S entity);
}
