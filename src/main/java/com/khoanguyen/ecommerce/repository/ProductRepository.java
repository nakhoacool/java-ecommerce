package com.khoanguyen.ecommerce.repository;

import com.khoanguyen.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByCategoryName(String category);

    List<Product> findAllByBrand(String brand);

    List<Product> findAllByName(String name);

    List<Product> findAllByCategoryNameAndBrand(String category, String brand);

    List<Product> findAllByBrandAndName(String brand, String name);

    Long countProductsByBrandAndName(String brand, String name);
}

