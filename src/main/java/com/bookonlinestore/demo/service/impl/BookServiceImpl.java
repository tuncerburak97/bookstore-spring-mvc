package com.bookonlinestore.demo.service.impl;

import com.bookonlinestore.demo.entity.Author;
import com.bookonlinestore.demo.entity.Book;
import com.bookonlinestore.demo.repository.AuthorRepository;
import com.bookonlinestore.demo.repository.BookRepository;
import com.bookonlinestore.demo.repository.CategoryRepository;
import com.bookonlinestore.demo.request.CreateBook;
import com.bookonlinestore.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public ResponseEntity<Object> createBook(CreateBook createBook) {

        Book book = new Book();


        book.setName(createBook.getName());
        book.setCategories(categoryRepository.findByCategoryName(createBook.getCategoryName()));
        book.setAuthors(Collections.singletonList(authorRepository.findByName(createBook.getAuthorName())));
        book.setPrice(createBook.getPrice());
        book.setIsbn(UUID.randomUUID());
        book.setPublishedDate(new Date(System.currentTimeMillis()));
        book.setImageUrl(createBook.getImageUrl());
        book.setDescription(createBook.getDescription());
        book.setCurrency(createBook.getCurrency());
        book.setAddedDate(new Date(System.currentTimeMillis()));

        bookRepository.save(book);

        Author author =authorRepository.findByName(createBook.getAuthorName());
        author.getRegisteredBooks().add(book);

        authorRepository.save(author);

        return ResponseEntity.status(HttpStatus.OK).body("Book added");


    }
}
