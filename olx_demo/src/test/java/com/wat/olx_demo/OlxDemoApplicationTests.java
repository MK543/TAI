package com.wat.olx_demo;

import com.wat.olx_demo.services.CategoriesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OlxDemoApplicationTests {

	@Autowired
	CategoriesService categoriesService;

	@Test
	public void checkServiceOutputCategories(){
		var output = categoriesService.getAllCategories();

		assert output.size() == 5;
		assert output.get(0).getName().equals("Scifi");
	}

}
