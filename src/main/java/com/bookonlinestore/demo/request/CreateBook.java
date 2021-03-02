package com.bookonlinestore.demo.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CreateBook {

    private String name;
    private String description;

    private double price;
    private String imageUrl;
    private String currency;

    private String categoryName;
    private String authorName;


}
