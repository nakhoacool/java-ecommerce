package com.khoanguyen.ecommerce.repository;

import com.khoanguyen.ecommerce.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {

    List<Image> findByProductId(Long product_id);
}
