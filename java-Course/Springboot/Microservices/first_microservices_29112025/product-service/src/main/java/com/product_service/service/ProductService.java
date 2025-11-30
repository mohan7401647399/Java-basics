package com.product_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product_service.entity.Product;
import com.product_service.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	// Create a product
	public Product createProduct(Product product) {
		return repository.save(product);
	}

	// Get All Products
	public List<Product> getAllProducts() {
		return repository.findAll();
	}

	// Get Product by Id
	public Product getProductById(Long id) {
		Product findProduct = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found: " + id));
		return findProduct;
	}
}
