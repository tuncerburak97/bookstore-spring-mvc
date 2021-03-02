package com.bookonlinestore.demo.response.builder;

import com.bookonlinestore.demo.entity.Author;
import com.bookonlinestore.demo.entity.Book;
import com.bookonlinestore.demo.entity.Orders;
import com.bookonlinestore.demo.entity.User;
import com.bookonlinestore.demo.response.OrderResponse;

import java.util.Date;
import java.util.*;
import java.util.stream.Collectors;

public class OrderResponseBuilder {

    public OrderResponse orderResponse(Orders orders, Book book, List<Author> author, User user){

        return OrderResponse.builder()
                .authorName(book.getAuthors().stream().filter(b -> b.getRegisteredBooks().equals(book)).collect(Collectors.toList()))
                .bookName(book.getName())
                .createdAt(new Date(System.currentTimeMillis()))
                .total(book.getPrice())
                .userId(user.getId())
                .build();

    }


}
