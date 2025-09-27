package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CourseRegistry;

public interface CourseRegistryRepo extends JpaRepository<CourseRegistry, Integer> {

}
