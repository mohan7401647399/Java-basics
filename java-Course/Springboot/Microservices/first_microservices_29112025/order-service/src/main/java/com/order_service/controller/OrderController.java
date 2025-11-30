package com.order_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order_service.dto.OrderResponseDTO;
import com.order_service.entity.Order;
import com.order_service.service.OrderService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService service;
	
	@PostMapping("/placeOrder")
	public Mono<ResponseEntity<OrderResponseDTO>> placeOrder(@RequestBody Order order) {
		return service.placeOrder(order);
	}
	
	@GetMapping("/allOrders")
	public List<Order> getAllOrders(){
		return service.getAllOrders();
	}
}
