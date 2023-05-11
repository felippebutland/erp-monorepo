package com.example.erpbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.erpbackend.Entities.LoggerEntity;
import com.example.erpbackend.repositories.LoggerRepository;

@Service
public class LoggerService {

    @Autowired
    private LoggerRepository loggerRepository;

    public void inserLog(LoggerEntity logger) {
        loggerRepository.save(logger);
    }
}