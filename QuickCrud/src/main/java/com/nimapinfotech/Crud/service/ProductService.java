package com.nimapinfotech.Crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nimapinfotech.Crud.entity.Category;
import com.nimapinfotech.Crud.entity.Product;
import com.nimapinfotech.Crud.repository.CategoryRepository;
import com.nimapinfotech.Crud.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	public Page<Product> getAllProducts(int page) {
		return productRepository.findAll(PageRequest.of(page, 10));
	}

	/*
	 * public Product createProduct(Product product) { return
	 * productRepository.save(product); }
	 */
	public Product createProduct(Product product) {
		Category category = categoryRepository.findById(product.getCategory().getId()).orElse(null);
		product.setCategory(category);
		return productRepository.save(product);
	}

	public Product getProductById(Long id) {
		return productRepository.findById(id).orElse(null);
	}

	public Product updateProduct(Long id, Product product) {
		product.setId(id);
		return productRepository.save(product);
	}

	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}
}
