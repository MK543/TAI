package com.wat.olx_demo.services;

import com.wat.olx_demo.dtos.CategoriesDto;

import java.util.List;

public interface CategoriesService {

    List<CategoriesDto> getAllCategories();
    void deleteById(int id);
}
