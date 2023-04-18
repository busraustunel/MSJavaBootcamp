package com.example.bootcampfinalproject.data.repository;

import com.example.bootcampfinalproject.data.entity.Category;
import com.example.bootcampfinalproject.data.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {

    @Query("select s.productList from Category s where s.categoryId = :categoryId")
    public Iterable<Product> findProductsByCategoryId(
            @Param("categoryId") double categoryId);
}
