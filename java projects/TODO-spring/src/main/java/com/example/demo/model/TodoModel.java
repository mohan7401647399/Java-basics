package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TodoModel {

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private boolean completed;

	public TodoModel(int id, String name, boolean completed) {
		this.id = id;
		this.name = name;
		this.completed = completed;
	}
	
	public TodoModel() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
}