package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Projects;
import com.example.demo.repository.ProjectRepository;

@org.springframework.stereotype.Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Projects createProject(Projects project) {
		return projectRepository.save(project);
	}
	
	public List<Projects> getProjects(){
		return projectRepository.findAll();
	}
}
