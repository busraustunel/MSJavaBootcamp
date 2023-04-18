package com.example.bootcampfinalproject.presentation.rest;

import com.example.bootcampfinalproject.business.dto.CategoryDto;
import com.example.bootcampfinalproject.business.dto.ProductDto;
import com.example.bootcampfinalproject.business.service.CategoryService;
import com.example.bootcampfinalproject.business.service.CategoryServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping()
@CrossOrigin(origins = "http://localhost:3000")
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public List<CategoryDto> listCategory(){
        return categoryService.listCategory();
    }

    @GetMapping("/products/{categoryId}")
    public List<ProductDto> listProductsByCategoryId(@PathVariable("categoryId") long categoryId){
        return categoryService.listProductsByCategoryId(categoryId);
    }
}
