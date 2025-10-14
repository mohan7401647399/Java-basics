package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepo;

import jakarta.transaction.Transactional;

@Service
public class BankService {

	@Autowired
	private AccountRepo repo;

	public BankService(AccountRepo repo) {
		this.repo = repo;
	}

	@Transactional
	public void transferMoney(Long fromId, Long toId, Double amount) {
		Account from = repo.findById(fromId)
				.orElseThrow(() -> new RuntimeException("sender account not found " + fromId));
		Account to = repo.findById(toId).orElseThrow(() -> new RuntimeException("sender account not found " + toId));

		// Deduct money
		from.setBalance(from.getBalance() - amount);

		if (from.getBalance() < amount) {
			throw new RuntimeException("Insufficient balance in account " + fromId);
		}

		if (amount > 5000) {
			throw new RuntimeException("Transfer limit exceeded");
		}

		// Add money
		to.setBalance(to.getBalance() + amount);

		repo.save(from);
		repo.save(to);
	}

}
