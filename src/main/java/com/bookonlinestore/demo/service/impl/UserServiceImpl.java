package com.bookonlinestore.demo.service.impl;

import com.bookonlinestore.demo.entity.Address;
import com.bookonlinestore.demo.entity.User;
import com.bookonlinestore.demo.repository.UserRepository;
import com.bookonlinestore.demo.request.CreateUser;
import com.bookonlinestore.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public ResponseEntity<Object> createUser(CreateUser createUser) {

        User user = new User();

        user.setName(createUser.getName());
        user.setSurname(createUser.getSurname());

        Address address = new Address();
        address.setCity(createUser.getAddress().getCity());
        address.setNumber(createUser.getAddress().getNumber());
        address.setZipcode(createUser.getAddress().getZipcode());
        address.setStreet(createUser.getAddress().getStreet());

        user.setAddress(address);

        userRepository.save(user);

        return ResponseEntity.ok("User created");


    }
}
