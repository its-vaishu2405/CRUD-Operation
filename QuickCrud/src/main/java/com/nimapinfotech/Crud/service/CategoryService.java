package com.nimapinfotech.Crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nimapinfotech.Crud.entity.Category;
import com.nimapinfotech.Crud.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;

	public Page<Category> getAllCategories(int page) {
		return categoryRepository.findAll(PageRequest.of(page, 10));
	}

	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}

	public Category getCategoryById(Long id) {
		return categoryRepository.findById(id).orElse(null);
	}

	public Category updateCategory(Long id, Category category) {
		category.setId(id);
		return categoryRepository.save(category);
	}

	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}
}
