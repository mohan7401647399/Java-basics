package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;
import com.example.demo.service.AddressService;

@RestController
@RequestMapping("/user")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/address/{id}")
	public Address getAddress(@PathVariable int id) {
		return addressService.getAddress(id);
	}
	
}
