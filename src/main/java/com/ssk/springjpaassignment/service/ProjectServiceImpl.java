package com.ssk.springjpaassignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssk.springjpaassignment.entity.Project;
import com.ssk.springjpaassignment.exception.ProjectNotFoundException;
import com.ssk.springjpaassignment.repository.ProjectRepository;



@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectRepository projectRepo;

	@Override
	public List<Project> getAllProjects() {
		return (List<Project>)projectRepo.findAll();
	}

	@Override
	public Project getProjectById(Integer projectId) {
		Optional<Project> projOpt = projectRepo.findById(projectId);
		if(projOpt.isEmpty()) {
			throw new ProjectNotFoundException("Project Not found with projecId - "+projectId);
		}
		return projOpt.get();
	}

	@Override
	public void addProject(Project prj) {
		projectRepo.save(prj);
		
	}

	@Override
	public void deleteProject(Integer projectId) {
		Project prj = getProjectById(projectId);
		projectRepo.delete(prj);
	}

	@Override
	public void updateProject(Project updatedPrj) {
		projectRepo.updateProjectDetails(updatedPrj.getProjectName(), updatedPrj.getDescription(), updatedPrj.getDuration(),updatedPrj.getProjectId());
	}

}
