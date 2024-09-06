package com.khoanguyen.ecommerce.dto;

import com.khoanguyen.ecommerce.model.Category;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int quantity;
    private String description;
    private Category category;
    private List<ImageDto> images;
}
