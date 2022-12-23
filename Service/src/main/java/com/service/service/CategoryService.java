package com.service.service;

import java.util.List;



import com.service.exceptions.CategoryException;
import com.service.model.Category;
import com.service.model.CategoryDTO;

public interface CategoryService {

	public Category listCategory(CategoryDTO category) throws CategoryException;
	public List<Category> getAllCategory() throws CategoryException;
}
