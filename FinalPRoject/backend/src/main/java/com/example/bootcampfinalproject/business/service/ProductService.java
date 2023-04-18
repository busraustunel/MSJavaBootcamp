package com.example.bootcampfinalproject.business.service;

import com.example.bootcampfinalproject.business.dto.ProductDto;

import java.util.List;

public interface ProductService {
    void add(ProductDto productDto);
    void change(ProductDto productDto);
    void delete(long productId);
    ProductDto find(long productId);
    List<ProductDto> list();


}
