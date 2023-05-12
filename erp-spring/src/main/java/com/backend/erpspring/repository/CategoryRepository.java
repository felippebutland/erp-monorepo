package com.backend.erpspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.erpspring.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}
