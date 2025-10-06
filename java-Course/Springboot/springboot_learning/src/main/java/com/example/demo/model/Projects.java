package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Projects {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String projectName;

	@ManyToMany(mappedBy = "projects")
	@JsonBackReference
	private List<User> users = new ArrayList<>();
}
