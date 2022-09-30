package com.crud.project.service;

import com.crud.project.entity.Project;
import com.crud.project.exceptions.ProjectNotFoundException;
import com.crud.project.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

        private final ProjectRepository projectRepository;

        @Autowired
        public ProjectService(ProjectRepository projectRepository){
            this.projectRepository = projectRepository;
        }

        public List<Project> findAll() {
            return projectRepository.findAll();
        }

        public Project findById(Long id){
            return projectRepository.findById(id).get();
        }

        public Long delete(Long id){
          /*  if(projectRepository.findById(id).isEmpty()){
                throw new ProjectNotFoundException();
            }*/
            projectRepository.findById(id).orElseThrow(ProjectNotFoundException::new);
            projectRepository.deleteById(id);

            return id;
        }

        public Project update(Project project) {
        if(projectRepository.findById(project.getId()).isEmpty()) {
            throw new ProjectNotFoundException();
        }

        return projectRepository.save(project);
        }

        public Project create(Project project){

            return projectRepository.save(project);

        }
    }



