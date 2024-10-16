package com.nimap.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nimap.crud.entity.Category;
import com.nimap.crud.repository.CategoryRepository;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepository;

	// GET all categories with pagination
	@GetMapping
	public ResponseEntity<?> getAllCategories(@RequestParam(defaultValue = "0") int page) {
		Page<Category> categories = categoryRepository.findAll(PageRequest.of(page, 5));

		if (categories.isEmpty()) {
			return ResponseEntity.ok("No categories found.");
		}

		return ResponseEntity.ok(categories);
	}

	// POST - Create a new category
	@PostMapping
	public ResponseEntity<?> createCategory(@RequestBody Category category) {
		Category createdCategory = categoryRepository.save(category);

		// Create a response message
		String message = String.format("Category created successfully: [ID: %d, Name: %s]", createdCategory.getId(),
				createdCategory.getName());

		return ResponseEntity.status(HttpStatus.CREATED).body(message);
	}

	// GET by id
	@GetMapping("/{id}")
	public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
		return categoryRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	// PUT - Update category by id
	@PutMapping("/{id}")
	public ResponseEntity<String> updateCategory(@PathVariable Long id, @RequestBody Category updatedCategory) {
		return categoryRepository.findById(id).map(category -> {
			category.setName(updatedCategory.getName());
			categoryRepository.save(category);
			return ResponseEntity.ok(
					"Category updated successfully: [ID: " + category.getId() + ", Name: " + category.getName() + "]");
		}).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body("Category not found with ID: " + id));
	}

	// DELETE - Delete category by id
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCategory(@PathVariable Long id) {
		return categoryRepository.findById(id).map(category -> {
			categoryRepository.delete(category);
			return ResponseEntity.ok("Category deleted successfully: [ID: " + id + "]");
		}).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body("Category not found with ID: " + id));
	}

}
