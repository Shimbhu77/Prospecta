package com.service.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.exceptions.CategoryException;
import com.service.model.Category;
import com.service.model.CategoryDTO;
import com.service.service.CategoryService;


@RestController
public class ServiceController {

	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/category")
	public ResponseEntity<Category> listCategory(@RequestBody CategoryDTO dto) throws CategoryException
	{

		Category category = categoryService.listCategory(dto);
		
		return new ResponseEntity<Category>(category,HttpStatus.CREATED);
	}
	
	@GetMapping("/entries")
	public ResponseEntity<List<Category>> getAllCategory() throws CategoryException
	{

		List<Category> category = categoryService.getAllCategory();
		
		return new ResponseEntity<List<Category>>(category,HttpStatus.OK);
	}
}
