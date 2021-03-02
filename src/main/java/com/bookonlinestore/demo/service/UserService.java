package com.bookonlinestore.demo.service;

import com.bookonlinestore.demo.request.CreateUser;
import org.springframework.http.ResponseEntity;

public interface UserService {

    public ResponseEntity<Object> createUser(CreateUser createUser);

}
