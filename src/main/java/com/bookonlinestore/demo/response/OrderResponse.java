package com.bookonlinestore.demo.response;

import com.bookonlinestore.demo.entity.Author;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.util.*;

import java.util.Date;

@Getter
@Setter
@Builder
public class OrderResponse {

    private Date createdAt;
    private double total;
    private long userId;

    private String bookName;
    private List<Author> authorName;


}
