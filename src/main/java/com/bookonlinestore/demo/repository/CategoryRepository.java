package com.bookonlinestore.demo.repository;

import com.bookonlinestore.demo.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Categories,Long> {

    Categories findByCategoryName(String name);

}
