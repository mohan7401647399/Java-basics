package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BankService;

@RestController
@RequestMapping("/bank")
public class BankController {

	@Autowired
	private final BankService service;

	public BankController(BankService service) {
		this.service = service;
	}

	@PostMapping("/transfer/{from}/{to}/{amount}")
	public String transfer(@PathVariable Long from, @PathVariable Long to, @PathVariable Double amount) {
		try {
			service.transferMoney(from, to, amount);
			return "Transfer successfully";
		} catch (Exception e) {
			return "Transfer failed " + e.getMessage();
		}
	}
}
