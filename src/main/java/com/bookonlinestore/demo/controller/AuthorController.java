package com.bookonlinestore.demo.controller;


import com.bookonlinestore.demo.entity.Author;
import com.bookonlinestore.demo.request.CreateUser;
import com.bookonlinestore.demo.service.AuthorService;
import com.bookonlinestore.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/create/{name}/{surname}")
    public ResponseEntity<Object> createUser(@PathVariable String name,@PathVariable String surname){
        return authorService.createAuthor(name,surname);
    }

}
