package com.bookonlinestore.demo.service;

import org.springframework.http.ResponseEntity;

public interface CategoryService {

    public ResponseEntity<Object> createCategory(String name);


}
