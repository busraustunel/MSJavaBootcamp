package com.example.bootcampfinalproject.business.dto;

import com.example.bootcampfinalproject.data.entity.Category;
import com.example.bootcampfinalproject.data.entity.Product;

public class ProductDto {

    private long productId;
    private String productName;
    private double salesPrice;
    private long categoryId;

    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }



    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public Product toEntity(){
        Product product = new Product();
        product.setProductId(this.getProductId());
        product.setProductName(this.getProductName());
        product.setSalesPrice(this.getSalesPrice());
        product.setImageUrl(this.getImageUrl());

        Category category = new Category();
        category.setCategoryId(this.getCategoryId());

        product.setCategory(category);
        return product;
    }

    public static ProductDto toDto(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setProductId(product.getProductId());
        productDto.setProductName(product.getProductName());
        productDto.setSalesPrice(product.getSalesPrice());
        productDto.setCategoryId(product.getCategory().getCategoryId());
        productDto.setImageUrl(product.getImageUrl());

        return productDto;
    }
}

