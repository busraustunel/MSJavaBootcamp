package com.example.bootcampfinalproject.data.entity;

import jakarta.persistence.*;

@Entity
public class CartProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cartProductId;
    private long cartId;
    private long productId;
    private double salesQuantity;

    private String imageUrl;

    public long getCartProductId() {
        return cartProductId;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


}

