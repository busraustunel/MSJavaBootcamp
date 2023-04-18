package com.example.bootcampfinalproject.business.dto;


import com.example.bootcampfinalproject.data.entity.CartProduct;

public class CartProductDto {
    private long cartProductId;
    private long cartId;
    private long productId;
    private double salesQuantity;
    private ProductDto productDto;

    private String imageUrl;

    public ProductDto getProductDto() {
        return productDto;
    }

    public void setProductDto(ProductDto productDto) {
        this.productDto = productDto;
    }

    public long getCartProductId() {
        return cartProductId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setCartProductId(long cartProductId) {
        this.cartProductId = cartProductId;
    }

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public double getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(double salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public CartProduct toEntity(){
        CartProduct cartProduct = new CartProduct();
        cartProduct.setCartProductId(this.getCartProductId());
        cartProduct.setProductId(this.getProductId());
        cartProduct.setCartId(this.getCartId());
        cartProduct.setSalesQuantity(this.getSalesQuantity());
        cartProduct.setImageUrl(this.getImageUrl());

        return cartProduct;
    }

    public static CartProductDto toDto(CartProduct cartProduct) {
        CartProductDto cartProductDto = new CartProductDto();
        cartProductDto.setProductId(cartProduct.getProductId());
        cartProductDto.setCartProductId(cartProduct.getCartProductId());
        cartProductDto.setSalesQuantity(cartProduct.getSalesQuantity());
        cartProductDto.setImageUrl(cartProduct.getImageUrl());

        return cartProductDto;
    }
}
