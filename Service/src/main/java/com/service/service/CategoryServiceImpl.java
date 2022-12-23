package com.service.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.exceptions.CategoryException;
import com.service.model.Category;
import com.service.model.CategoryDTO;
import com.service.repository.CategoryDao;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public Category listCategory(CategoryDTO category) throws CategoryException {
		
		Category newCategory = new Category();
		newCategory.setDescription(category.getDescription());
		newCategory.setTitle(category.getTitle());
		newCategory.setName(category.getName());
		
		return categoryDao.save(newCategory);
	}

	@Override
	public List<Category> getAllCategory() throws CategoryException {
		
		List<Category> list = categoryDao.findAll();
		
		return list;
	}

	
}
