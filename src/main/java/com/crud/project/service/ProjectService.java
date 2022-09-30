package com.crud.project.service;

import com.crud.project.dto.ProjectRequest;
import com.crud.project.entity.Project;
import com.crud.project.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

        private final ProjectRepository projectRepository;

        @Autowired
        public ProjectService(ProjectRepository projectRepository){
            this.projectRepository = projectRepository;
        }
        public Project create(ProjectRequest projectRequest){

            Project project = Project
                    .builder()
                    .name(ProjectRequest.getName())
                    .country(ProjectRequest.getCountry())
                    .build();
            return projectRepository.save(project);
    }
    }

