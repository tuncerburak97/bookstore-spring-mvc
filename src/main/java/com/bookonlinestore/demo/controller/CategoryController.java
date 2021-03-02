package com.bookonlinestore.demo.controller;


import com.bookonlinestore.demo.request.CreateUser;
import com.bookonlinestore.demo.service.CategoryService;
import com.bookonlinestore.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/create/{name}")
    public ResponseEntity<Object> createCategory(@PathVariable String name){
        return categoryService.createCategory(name);
    }

}