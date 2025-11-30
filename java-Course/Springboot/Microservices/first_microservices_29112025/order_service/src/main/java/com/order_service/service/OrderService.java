package com.order_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.order_service.dto.OrderResponseDTO;
import com.order_service.dto.ProductDTO;
import com.order_service.entity.Order;
import com.order_service.entity.repository.OrderRepository;

import reactor.core.publisher.Mono;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	@Autowired
	private WebClient.Builder webClientBuilder;

	// place order
	public Mono<ResponseEntity<OrderResponseDTO>> placeOrder(Order order) {
		return webClientBuilder
				.build()
				.get()
				.uri("http://localhost:8081/product/" + order.getProductId())
				.retrieve()
				.bodyToMono(ProductDTO.class).map(productDTO -> {
					
					OrderResponseDTO orderResponseDTO = new OrderResponseDTO();

					orderResponseDTO.setProductId(order.getProductId());
					orderResponseDTO.setQuantity(order.getQuantity());

					// set product details
					orderResponseDTO.setProductName(productDTO.getName());
					orderResponseDTO.setPruductPrice(productDTO.getPrice());
					
					orderResponseDTO.setTotalPrice(order.getQuantity() * productDTO.getPrice());

					// save order details to DB
					repository.save(order);
					orderResponseDTO.setOrderId(order.getId());
					return ResponseEntity.ok(orderResponseDTO);
				});
	}
	
	// Get All Orders
	public List<Order> getAllOrders(){
		return repository.findAll();
	}
}
