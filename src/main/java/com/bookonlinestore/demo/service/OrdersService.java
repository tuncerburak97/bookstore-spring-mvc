package com.bookonlinestore.demo.service;

import com.bookonlinestore.demo.entity.Orders;
import com.bookonlinestore.demo.response.OrderResponse;
import org.springframework.http.ResponseEntity;

public interface OrdersService {

    public ResponseEntity<OrderResponse> createOrder(String bookName, long userId);

}
