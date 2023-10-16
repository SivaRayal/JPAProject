package com.ssk.springjpaassignment.repository;

import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.ssk.springjpaassignment.entity.Project;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Integer>{

	Optional<Project> findByProjectName(String projectName);
	
	@Transactional
	@Modifying
	@Query("update Project set project_name=:projectName, description=:description, duration=:duration where project_id=:projectId")
	void updateProjectDetails(@Param("projectName") String projectName, @Param("description") String description, @Param("duration") Integer duration, @Param("projectId") Integer projectId);
}
