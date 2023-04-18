package com.example.bootcampfinalproject.business.service;


import com.example.bootcampfinalproject.business.dto.CartDto;
import com.example.bootcampfinalproject.business.dto.CheckoutDto;
import com.example.bootcampfinalproject.data.entity.Cart;

import java.util.Optional;

public interface CartService  {
    long add();
    Optional<Cart> find(long cartId);
    long delete(long cartId);
    void checkout(CheckoutDto checkoutDto);

}
