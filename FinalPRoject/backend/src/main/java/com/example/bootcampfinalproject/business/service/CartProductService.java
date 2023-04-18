package com.example.bootcampfinalproject.business.service;

import com.example.bootcampfinalproject.business.dto.CartProductDto;
import com.example.bootcampfinalproject.data.entity.CartProduct;

import java.util.List;
import java.util.Optional;


public interface CartProductService {
    void add(CartProductDto cartProductDto);
    void remove(long cartId, long productId);
    Optional<CartProduct> findByCartIdAndProductId(long cartId, long productId);
    void update(long cartProductId, double salesQuantity);
    List<CartProductDto> getCartProductList(long cartId);

}
