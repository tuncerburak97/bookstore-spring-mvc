package com.bookonlinestore.demo.service;

import com.bookonlinestore.demo.entity.Book;
import com.bookonlinestore.demo.request.CreateBook;
import org.springframework.http.ResponseEntity;

public interface BookService {

    public ResponseEntity<Object> createBook(CreateBook createBook);


}
