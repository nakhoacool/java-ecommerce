package com.khoanguyen.ecommerce.service.cart;

import com.khoanguyen.ecommerce.exceptions.ResourceNotFoundException;
import com.khoanguyen.ecommerce.model.Cart;
import com.khoanguyen.ecommerce.repository.CartItemRepository;
import com.khoanguyen.ecommerce.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class CartService implements ICartService {
    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;

    @Override
    public Cart getCart(Long id) {
        Cart cart = cartRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cart not found"));
        BigDecimal totalPrice = cart.getTotalPrice();
        cart.setTotalPrice(totalPrice);
        return cartRepository.save(cart);
    }

    @Override
    public void clearCart(Long id) {
        Cart cart = getCart(id);
        cartItemRepository.deleteAllByCartId(id);
        cart.getCartItems().clear();
        cartRepository.deleteById(id);
    }

    @Override
    public BigDecimal getTotalPrice(Long id) {
        Cart cart = getCart(id);
        return cart.getTotalPrice();
    }
}
