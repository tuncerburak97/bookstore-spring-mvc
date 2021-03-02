package com.bookonlinestore.demo.service.impl;

import com.bookonlinestore.demo.entity.Categories;
import com.bookonlinestore.demo.repository.CategoryRepository;
import com.bookonlinestore.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.Id;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public ResponseEntity<Object> createCategory(String name) {

        Categories categories = new Categories();
        categories.setCategoryName(name);

        categoryRepository.save(categories);

        return ResponseEntity.status(HttpStatus.OK).body("Category added");

    }
}
