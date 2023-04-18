package com.example.bootcampfinalproject.business.service;

import com.example.bootcampfinalproject.business.dto.CartProductDto;
import com.example.bootcampfinalproject.business.dto.ProductDto;
import com.example.bootcampfinalproject.data.entity.CartProduct;
import com.example.bootcampfinalproject.data.entity.Product;
import com.example.bootcampfinalproject.data.repository.CartProductRepository;
import com.example.bootcampfinalproject.data.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class CartProductServiceImpl implements CartProductService {
    private CartProductRepository cartProductRepository;
    private ProductRepository productRepository;
    public CartProductServiceImpl(CartProductRepository cartProductRepository, ProductRepository productRepository){
        this.cartProductRepository = cartProductRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void add(CartProductDto cartProductDto) {
        cartProductRepository.save(cartProductDto.toEntity());
    }

    @Override
    @Transactional
    public void remove(long cartId, long productId) {
        cartProductRepository.deleteByCartIdAndProductId(cartId, productId);
    }

    @Override
    public Optional<CartProduct> findByCartIdAndProductId(long cartId, long productId) {
        return cartProductRepository.findByCartIdAndProductId(cartId,productId);
    }

    @Override
    public void update(long cartProductId, double salesQuantity) {
        cartProductRepository.updateSalesQuantity(cartProductId,salesQuantity);
    }

    @Override
    public List<CartProductDto> getCartProductList(long cartId) {
        List<CartProductDto> cartProductDtos = new ArrayList<>();
        for(CartProduct cartProduct : cartProductRepository.getCartProductsByCartId(cartId)){
            Product product = productRepository.findById((int) cartProduct.getProductId()).get();
            CartProductDto cartProductDto = CartProductDto.toDto(cartProduct);
            cartProductDto.setProductDto(ProductDto.toDto(product));
            cartProductDtos.add(cartProductDto);
        }
        return cartProductDtos;
    }

}
