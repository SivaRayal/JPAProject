package com.ssk.springjpaassignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssk.springjpaassignment.entity.Project;
import com.ssk.springjpaassignment.service.ProjectService;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	
	@GetMapping
	public List<Project> getAllProjects(){
		return projectService.getAllProjects();
	}
	
	@GetMapping("/{projectId}")
	public Project getProjectById(@PathVariable Integer projectId) {
		return projectService.getProjectById(projectId);
	}
	
	@PostMapping
	public ResponseEntity<String> addProject(@RequestBody Project prj) {
		projectService.addProject(prj);
		return new ResponseEntity<String>("Project added sucessfully.",HttpStatus.OK);
	}
	
	@DeleteMapping("/{projectId}")
	public ResponseEntity<String> deleteEmployeeById(@PathVariable Integer projectId){
		projectService.deleteProject(projectId);
		return new ResponseEntity<String>("Project deleted sucessfully.",HttpStatus.OK);
	}
	
	@PostMapping("/update")
	public ResponseEntity<String> updateProject(@RequestBody Project prj) {
		projectService.updateProject(prj);
		return new ResponseEntity<String>("Project added sucessfully.",HttpStatus.OK);
	}
}
