package com.example.bootcampfinalproject.business.service;


import com.example.bootcampfinalproject.business.dto.CategoryDto;
import com.example.bootcampfinalproject.business.dto.ProductDto;

import java.util.List;

public interface CategoryService {
    void add(CategoryDto categoryDto);
    void change(CategoryDto categoryDto);
    void delete(long categoryId);
    void find(long categoryId);
    List<CategoryDto> listCategory();
    List<ProductDto> listProductsByCategoryId(long categoryId);
}
