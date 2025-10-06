package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Projects;

@org.springframework.stereotype.Repository
public interface ProjectRepository extends JpaRepository<Projects, Long> {

}
