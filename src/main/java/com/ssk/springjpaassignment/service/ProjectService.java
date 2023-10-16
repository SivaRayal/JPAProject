package com.ssk.springjpaassignment.service;

import java.util.List;

import com.ssk.springjpaassignment.entity.Project;



public interface ProjectService {
	List<Project> getAllProjects();
	Project getProjectById(Integer ProjectId);
	void addProject(Project prj);
	void deleteProject(Integer projectId);
	void updateProject(Project updatedPrj);
}
