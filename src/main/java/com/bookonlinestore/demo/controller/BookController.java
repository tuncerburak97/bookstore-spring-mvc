package com.bookonlinestore.demo.controller;


import com.bookonlinestore.demo.entity.Book;
import com.bookonlinestore.demo.request.CreateBook;
import com.bookonlinestore.demo.request.CreateUser;
import com.bookonlinestore.demo.service.BookService;
import com.bookonlinestore.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/create")
    public ResponseEntity<Object> createUser(@RequestBody CreateBook createBook){
        return bookService.createBook(createBook);
    }

}