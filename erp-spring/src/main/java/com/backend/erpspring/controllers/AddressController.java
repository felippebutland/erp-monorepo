package com.backend.erpspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.erpspring.Entities.AddressEntity;
import com.backend.erpspring.Enums.AddressEnum;
import com.backend.erpspring.repository.AddressRepository;

@RestController
@RequestMapping("/address")
public class AddressController {
  
  @Autowired
  private AddressRepository addressRepository;

  @GetMapping
  public List<AddressEntity> getAllAddress() {
    return addressRepository.findAll();
  }

  @PostMapping
  public void createAddress(AddressEntity address) {
    addressRepository.save(address);
  }

  @GetMapping("/{type}")
  public AddressEntity getAddress(AddressEnum type) {
    return addressRepository.findByType(type);
  }
}
