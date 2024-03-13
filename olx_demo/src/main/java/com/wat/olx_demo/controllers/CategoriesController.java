package com.wat.olx_demo.controllers;

import com.wat.olx_demo.dtos.CategoriesDto;
import com.wat.olx_demo.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<CategoriesDto> getCategories(){
        return categoriesService.getAllCategories();
    }
}
