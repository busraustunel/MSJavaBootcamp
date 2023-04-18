package com.example.bootcampfinalproject.presentation.rest;

import com.example.bootcampfinalproject.business.dto.CartProductDto;
import com.example.bootcampfinalproject.business.service.CartProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart-product")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CartProductController {

    @Autowired
    private CartProductService cartProductService;

    @GetMapping("/list/{cartId}")
    public List<CartProductDto> getCartProductsByCartId(@PathVariable int cartId) {
        return cartProductService.getCartProductList(cartId);
    }
}