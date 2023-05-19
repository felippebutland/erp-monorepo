package com.backend.erpspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.erpspring.Entities.SalesEntity;
import com.backend.erpspring.repository.SalesRepository;

@RestController
@RequestMapping("/sale")
public class SalesController {
    @Autowired
    private SalesRepository salesRepository;

    @GetMapping
    public List<SalesEntity> getAllSales() {
        return salesRepository.findAll();
    }
    @PostMapping
    public void createSales(SalesEntity user) {
        salesRepository.save(user);
        
    }
}
