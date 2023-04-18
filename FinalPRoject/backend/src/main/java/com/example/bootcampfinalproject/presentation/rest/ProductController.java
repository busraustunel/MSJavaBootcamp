package com.example.bootcampfinalproject.presentation.rest;

import com.example.bootcampfinalproject.business.dto.ProductDto;
import com.example.bootcampfinalproject.business.service.ProductService;
import com.example.bootcampfinalproject.business.service.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/product/{productId}")
    public ProductDto find(@PathVariable("productId") long productId){
        return productService.find(productId);
    }


}

