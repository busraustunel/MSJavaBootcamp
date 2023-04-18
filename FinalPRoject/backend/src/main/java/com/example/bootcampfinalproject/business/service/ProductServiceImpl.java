package com.example.bootcampfinalproject.business.service;

import com.example.bootcampfinalproject.business.dto.CategoryDto;
import com.example.bootcampfinalproject.business.dto.ProductDto;
import com.example.bootcampfinalproject.data.entity.Product;
import com.example.bootcampfinalproject.data.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.example.bootcampfinalproject.business.dto.ProductDto.toDto;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public void add(ProductDto productDto) {
        productRepository.save(productDto.toEntity());
    }

    @Override
    public void change(ProductDto productDto) {

    }

    @Override
    public void delete(long productId) {

    }

    @Override
    public ProductDto find(long productId) {
        Optional<Product> product = productRepository.findById((int) productId);
        return toDto(product.get());
    }

    @Override
    public List<ProductDto> list() {
        List<ProductDto> productDtoList = new ArrayList<>();
        for(Product product: productRepository.findAll()){
            productDtoList.add(toDto(product));
        }
        return productDtoList;
    }



}


