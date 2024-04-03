package com.wat.olx_demo.controllers;

import com.wat.olx_demo.dtos.CategoryDto;
import com.wat.olx_demo.dtos.CategoryRequestDto;
import com.wat.olx_demo.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesController {
    private final CategoriesService categoriesService;

    @Autowired
    public CategoriesController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }
    @GetMapping("/all")
    public List<CategoryDto> getCategories(){
        return categoriesService.getAllCategories();
    }

    @PostMapping("/add")
    public void addCategories(@RequestBody CategoryRequestDto categoryRequestDto){
        categoriesService.addCategory(categoryRequestDto);
    }
}
