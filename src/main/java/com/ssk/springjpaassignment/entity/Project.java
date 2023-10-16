package com.ssk.springjpaassignment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
	@Id
	private int projectId;
	private String projectName;
	private String description;
	private int duration;
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", description=" + description
				+ ", duration=" + duration + "]";
	}
	public Project(int projectId, String projectName, String description, int duration) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.description = description;
		this.duration = duration;
	}
	
	public Project() {}
	
	
}
