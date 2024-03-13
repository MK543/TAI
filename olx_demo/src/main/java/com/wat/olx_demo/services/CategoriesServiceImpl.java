package com.wat.olx_demo.services;

import com.wat.olx_demo.dtos.CategoriesDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService{

    @Override
    public void deleteById(int id) {

    }

    @Override
    public List<CategoriesDto> getAllCategories() {
        return List.of(
                new CategoriesDto(1, "Scifi"),
                new CategoriesDto(2, "Cooking"),
                new CategoriesDto(3, "Adventure")
        );
    }
}
