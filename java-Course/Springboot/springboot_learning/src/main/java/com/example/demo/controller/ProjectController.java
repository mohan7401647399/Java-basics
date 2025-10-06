package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Projects;
import com.example.demo.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@PostMapping("/create/project")
	public Projects createProject(@RequestBody Projects project) {
		return projectService.createProject(project);
	}
	
	@GetMapping("/projects")
	public List<Projects> getAllProjects(){
		return projectService.getProjects();
	}
}
