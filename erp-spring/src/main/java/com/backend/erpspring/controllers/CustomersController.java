package com.backend.erpspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.erpspring.Entities.CustomersEntity;
import com.backend.erpspring.repository.CustomersRepository;

@RestController
@RequestMapping("/api/customer")
public class CustomersController {
  @Autowired
  private CustomersRepository customersRepository;

  @GetMapping
  public List<CustomersEntity> getAllCustomers() {
    return customersRepository.findAll();
  }

  @PostMapping
  public void createCustomer(CustomersEntity customer) {
    customersRepository.save(customer);
  }

}
