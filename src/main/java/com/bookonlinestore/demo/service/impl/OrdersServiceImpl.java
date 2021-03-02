package com.bookonlinestore.demo.service.impl;

import com.bookonlinestore.demo.entity.Author;
import com.bookonlinestore.demo.entity.Book;
import com.bookonlinestore.demo.entity.Orders;
import com.bookonlinestore.demo.entity.User;
import com.bookonlinestore.demo.repository.BookRepository;
import com.bookonlinestore.demo.repository.OrdersRepository;
import com.bookonlinestore.demo.repository.UserRepository;
import com.bookonlinestore.demo.response.OrderResponse;
import com.bookonlinestore.demo.response.builder.OrderResponseBuilder;
import com.bookonlinestore.demo.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.*;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private OrdersRepository ordersRepository;


    @Override
    public ResponseEntity<OrderResponse> createOrder(String bookName, long userId) {

        Orders orders = new Orders();

        User user = userRepository.findById(userId);
        Book book = bookRepository.findByName(bookName);

        List<Author> authors =book.getAuthors();

        orders.setTotal(book.getPrice());
        orders.setUser(user);
        orders.setCreatedAt(new Date(System.currentTimeMillis()));
        orders.setOrderedBook(Collections.singletonList(book));

        ordersRepository.save(orders);

        OrderResponseBuilder orderResponseBuilder = new OrderResponseBuilder();
        OrderResponse orderResponse=orderResponseBuilder.orderResponse(orders,book,authors,user);

        return ResponseEntity.ok(orderResponse);
    }
}
