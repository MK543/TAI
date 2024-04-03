package com.wat.olx_demo.services;

import com.wat.olx_demo.dtos.CategoryDto;
import com.wat.olx_demo.dtos.CategoryRequestDto;

import java.util.List;

public interface CategoriesService {

    List<CategoryDto> getAllCategories();
    void deleteById(int id);

    void addCategory(CategoryRequestDto categoryRequestDto);
}
