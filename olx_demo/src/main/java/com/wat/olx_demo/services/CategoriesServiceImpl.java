package com.wat.olx_demo.services;

import com.wat.olx_demo.dtos.CategoryDto;
import com.wat.olx_demo.dtos.CategoryRequestDto;
import com.wat.olx_demo.entities.Category;
import com.wat.olx_demo.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class CategoriesServiceImpl implements CategoriesService{

    final private CategoryRepository categoryRepository;

    @Override
    public void deleteById(int id) {

    }

    @Override
    public List<CategoryDto> getAllCategories() {
        return categoryRepository.findAll().stream()
                .map(c -> new CategoryDto(c.getId(), c.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public void addCategory(CategoryRequestDto categoryRequestDto) {
        categoryRepository.save(new Category(categoryRequestDto.getName()));
    }
}
