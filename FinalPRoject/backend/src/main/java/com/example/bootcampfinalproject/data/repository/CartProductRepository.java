package com.example.bootcampfinalproject.data.repository;


import com.example.bootcampfinalproject.data.entity.CartProduct;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartProductRepository extends CrudRepository<CartProduct, Long> {

    public void deleteByCartIdAndProductId(long cartId, long productId);

    public Optional<CartProduct> findByCartIdAndProductId(long cartId, long productId);

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query("update CartProduct cp set cp.salesQuantity = :salesQuantity where cp.cartProductId = :cartProductId")
    public void updateSalesQuantity(@Param("cartProductId") long cartProductId, @Param("salesQuantity") double salesQuantity);

    public List<CartProduct> getCartProductsByCartId(long cartId);

}
