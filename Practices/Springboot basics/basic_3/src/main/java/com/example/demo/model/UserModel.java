package com.example.demo.model;

public class UserModel {

	private String name;
	
	private String email;
	
	public String getName() {
		return "User name is " + name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return "User mail id is " + email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
