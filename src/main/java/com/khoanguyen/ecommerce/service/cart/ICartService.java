package com.khoanguyen.ecommerce.service.cart;

import com.khoanguyen.ecommerce.model.Cart;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);

    void clearCart(Long id);

    BigDecimal getTotalPrice(Long id);
}
