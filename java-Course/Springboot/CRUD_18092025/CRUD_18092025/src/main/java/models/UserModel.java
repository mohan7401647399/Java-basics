package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserModel {
	@Id
	private int userId;
	private String name;
	private int age;
	
	public UserModel() {		
	}

	public UserModel(int userId, String name, int age) {
		this.userId = userId;
		this.name = name;
		this.age = age;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
