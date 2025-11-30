package product_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import product_service.entity.Product;
import product_service.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	//	create product
	public Product createProduct(Product product) {
		return repository.save(product);
	}

	//	get all products
	public List<Product> getAllProducts() {
		return repository.findAll();
	}

	//	get a product by id
	public Product getProductById(int id) {
		return repository.findById(id).orElseThrow();
	}
}
