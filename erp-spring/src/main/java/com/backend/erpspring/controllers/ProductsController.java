package com.backend.erpspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.erpspring.Entities.ProductsEntity;
import com.backend.erpspring.repository.ProductsRepository;;

@RestController
@RequestMapping("/product")
public class ProductsController {
  
  @Autowired
  private ProductsRepository productsRepository;

  @GetMapping
  public List<ProductsEntity> getAllProducts() {
    return productsRepository.findAll();
  }

  @PostMapping
  public void createProduct(ProductsEntity product) {
    productsRepository.save(product);
  }
}
