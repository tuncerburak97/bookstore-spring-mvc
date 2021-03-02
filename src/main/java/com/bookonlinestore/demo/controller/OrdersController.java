package com.bookonlinestore.demo.controller;

import com.bookonlinestore.demo.entity.Orders;
import com.bookonlinestore.demo.response.OrderResponse;
import com.bookonlinestore.demo.service.CategoryService;
import com.bookonlinestore.demo.service.OrdersService;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @PostMapping("/create/{bookName}/{userId}")
    public ResponseEntity<OrderResponse> createOrder(@PathVariable String bookName, @PathVariable long userId){
        return ordersService.createOrder(bookName,userId);
    }

}