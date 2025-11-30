package order_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import order_service.entity.Order;
import order_service.entity.Product;
import order_service.feign.ProductClient;
import order_service.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private ProductClient client;
	
	//	place order
	public Order createOrder(Order order) {
		Product product = client.getProduct(order.getProductId());
		order.setProductDetails(product);
		
		return repository.save(order);
	}
	
	//	get all orders
	public List<Order> getAllOrders(){
		return repository.findAll();
	}
	
	//	get order by id
	public Order getOrderById(Integer id) {
		Order order = repository.findById(id).orElseThrow();
		
		if(order != null) {
			order.setProductDetails(client.getProduct(order.getProductId()));
		}
		return order;
	}
}
