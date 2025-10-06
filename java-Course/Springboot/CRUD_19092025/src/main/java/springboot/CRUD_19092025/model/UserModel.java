package springboot.CRUD_19092025.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class UserModel {
	
	@Id
	private int userId;
	private String name;
	private int age;
	private String technology;
	
	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public UserModel() {		
	}

	public UserModel(int userId, String name, int age, String technology) {
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.technology = technology;
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