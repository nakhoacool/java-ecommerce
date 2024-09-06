package com.khoanguyen.ecommerce.service.product;

import com.khoanguyen.ecommerce.dto.ProductDto;
import com.khoanguyen.ecommerce.model.Product;
import com.khoanguyen.ecommerce.request.AddProductRequest;
import com.khoanguyen.ecommerce.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest request);

    Product getProductById(Long id);

    Product updateProductById(ProductUpdateRequest request, Long id);

    void deleteProductById(Long id);

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    List<Product> getProductsByBrand(String brand);

    List<Product> getProductsByName(String name);

    List<Product> getProductsByCategoryAndBrand(String category, String brand);

    List<Product> getProductsByBrandAndName(String brand, String name);

    Long countProductsByBrandAndName(String brand, String name);

    List<ProductDto> getConvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);
}
