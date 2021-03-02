package com.bookonlinestore.demo.service;

import org.springframework.http.ResponseEntity;

public interface AuthorService {

    public ResponseEntity<Object> createAuthor(String name,String surname);

}
