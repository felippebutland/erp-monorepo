package com.backend.erpspring.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.erpspring.Entities.Category;
import com.backend.erpspring.repository.CategoryRepository;

@RestController
@RequestMapping("/category")
public class CategoriesController {

    private final CategoryRepository categoryRepository;

    public CategoriesController (CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    
    @GetMapping
    public List<Category> listCategories() {
        return this.categoryRepository.findAll();
    }

    @PostMapping
    public void createCategory(Category category) {
        this.categoryRepository.save(category);
    }

    @GetMapping("/{id}")
    public Category getCategory(UUID id) {
        return this.categoryRepository.findById(id).orElseThrow();
    }
}
