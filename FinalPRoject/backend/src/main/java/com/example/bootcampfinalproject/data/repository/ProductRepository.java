package com.example.bootcampfinalproject.data.repository;

import com.example.bootcampfinalproject.data.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
    List<Product> findAllByCategoryCategoryIdOrderByProductNameAsc(int categoryId);
    Optional<Product> findByProductId(Integer productId);

}
