package com.example.demo.model;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private String email;
	private Long mobile_no;
	private int salary;

//	public User() {
//	};
//
//	public User(int id, String name, int age, String email, Long mobile_no, int salary) {
//		this.id = id;
//		this.name = name;
//		this.age = age;
//		this.email = email;
//		this.mobile_no = mobile_no;
//		this.salary = salary;
//	};
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public Long getMobile_no() {
//		return mobile_no;
//	}
//
//	public void setMobile_no(Long mobile_no) {
//		this.mobile_no = mobile_no;
//	}
//	
//	public int getSalary() {
//		return salary;
//	}
//
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}

}
