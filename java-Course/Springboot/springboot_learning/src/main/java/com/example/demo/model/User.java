package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private int age;
	private String email;
	private Long mobile_no;
	private int salary;
	private boolean active;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	@JsonManagedReference
	private Address address;
	
	@ManyToOne
	@JoinColumn(name = "dept_id")
	@JsonBackReference
	private Department department;
	
	@ManyToMany
	@JoinTable(name = "user_project",							//	Join table name
	joinColumns = @JoinColumn(name = "user_id"),				//	FK for user
	inverseJoinColumns = @JoinColumn(name = "project_id"))		//	FK for project
	private List<Projects> projects = new ArrayList<>();
	
}
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
