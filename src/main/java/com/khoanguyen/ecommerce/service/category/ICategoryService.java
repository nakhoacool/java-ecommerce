package com.khoanguyen.ecommerce.service.category;

import com.khoanguyen.ecommerce.model.Category;

import java.util.List;

public interface ICategoryService {
    Category addCategory(Category category);

    Category getCategoryById(Long id);

    Category getCategoryByName(String name);

    Category updateCategoryById(Category category, Long id);

    void deleteCategoryById(Long id);

    List<Category> getAllCategories();

}
