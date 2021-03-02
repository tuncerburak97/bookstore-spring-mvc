package com.bookonlinestore.demo.repository;

import com.bookonlinestore.demo.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {

    Author findByName(String name);



}
