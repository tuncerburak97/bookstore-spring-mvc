package com.bookonlinestore.demo.repository;

import com.bookonlinestore.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,String> {

    Book findByName(String name);

}
