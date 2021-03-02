package com.bookonlinestore.demo.service.impl;

import com.bookonlinestore.demo.entity.Author;
import com.bookonlinestore.demo.repository.AuthorRepository;
import com.bookonlinestore.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public ResponseEntity<Object> createAuthor(String name, String surname) {

        Author author = new Author();

        author.setName(name);
        author.setLastName(surname);

        authorRepository.save(author);

        return ResponseEntity.status(HttpStatus.OK).body("Author added");

    }
}
