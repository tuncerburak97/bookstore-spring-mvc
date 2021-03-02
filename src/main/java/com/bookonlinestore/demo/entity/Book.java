package com.bookonlinestore.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;
import java.util.*;

@Entity
@Getter
@Setter
public class Book {

    @Id
    private UUID isbn;

    private String name;
    private String description;
    private Date publishedDate;
    private Date addedDate;

    private double price;
    private String imageUrl;
    private String currency;

    @ManyToOne
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    private Categories categories;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE,mappedBy = "registeredBooks")
    private List<Author> authors;

    @ManyToMany(mappedBy = "orderedBook",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Orders> orders=new HashSet<>();



}
