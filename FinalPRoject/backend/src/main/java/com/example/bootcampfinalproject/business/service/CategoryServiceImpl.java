package com.example.bootcampfinalproject.business.service;

import com.example.bootcampfinalproject.business.dto.CategoryDto;
import com.example.bootcampfinalproject.business.dto.ProductDto;
import com.example.bootcampfinalproject.data.entity.Category;
import com.example.bootcampfinalproject.data.entity.Product;
import com.example.bootcampfinalproject.data.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;
    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
    @Override
    public void add(CategoryDto categoryDto) {
        categoryRepository.save(categoryDto.toEntity());
    }

    @Override
    public void change(CategoryDto categoryDto) {

    }

    @Override
    public void delete(long categoryId) {

    }

    @Override
    public void find(long categoryId) {

    }

    @Override
    public List<CategoryDto> listCategory() {
        List<CategoryDto> categoryList = new ArrayList<>();
        for(Category category: categoryRepository.findAll()){
            categoryList.add(CategoryDto.toDto(category));
        }
        return categoryList;
    }
    @Override
    public List<ProductDto> listProductsByCategoryId(long categoryId){
        List<ProductDto> productDtoList = new ArrayList<>();
        for(Product product: categoryRepository.findProductsByCategoryId(categoryId)){
            productDtoList.add(ProductDto.toDto(product));
        }
        return productDtoList;
    }



}


