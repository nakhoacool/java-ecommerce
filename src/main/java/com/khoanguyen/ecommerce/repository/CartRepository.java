package com.khoanguyen.ecommerce.repository;

import com.khoanguyen.ecommerce.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
