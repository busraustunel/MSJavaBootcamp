package com.example.bootcampfinalproject.business.service;

import com.example.bootcampfinalproject.business.dto.CartDto;
import com.example.bootcampfinalproject.business.dto.CartProductDto;
import com.example.bootcampfinalproject.business.dto.CheckoutDto;
import com.example.bootcampfinalproject.business.dto.ProductDto;
import com.example.bootcampfinalproject.data.entity.Cart;
import com.example.bootcampfinalproject.data.entity.CartProduct;
import com.example.bootcampfinalproject.data.entity.CartStatus;
import com.example.bootcampfinalproject.data.entity.Product;
import com.example.bootcampfinalproject.data.repository.CartProductRepository;
import com.example.bootcampfinalproject.data.repository.CartRepository;
import com.example.bootcampfinalproject.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {
    private CartRepository cartRepository;
    public CartServiceImpl(CartRepository cartRepository){
        this.cartRepository = cartRepository;
    }

    @Override
    public long add() {
        Cart cart = new Cart();
        cart.setCartStatus(CartStatus.NEW);

        return cartRepository.save(cart).getCartId();
    }

    @Override
    public Optional<Cart> find(long cartId) {
        return cartRepository.findById(cartId);
    }

    @Override
    public long delete(long cartId) {
        cartRepository.deleteById(cartId);
        return cartId;
    }

    @Override
    public void checkout(CheckoutDto checkoutDto) {
        Cart cart = cartRepository.findById(checkoutDto.getCartId()).get();
        cart.setCustomerName(checkoutDto.getCustomerName());
        cart.setCardNumber(checkoutDto.getCardNumber());
        cart.setCartStatus(CartStatus.COMPLETED);
        cartRepository.save(cart);
    }
}



