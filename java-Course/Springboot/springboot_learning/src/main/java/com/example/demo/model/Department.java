package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long deptId;
	
	private String deptName;
	
	// one department can have many employees
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private List<User> users = new ArrayList<>(); 
}
