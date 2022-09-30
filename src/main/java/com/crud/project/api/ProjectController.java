package com.crud.project.api;


import com.crud.project.dto.ProjectRequest;
import com.crud.project.entity.Project;
import com.crud.project.repository.ProjectRepository;
import com.crud.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/project")

public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService){
        this.projectService = projectService;
    }
    /*@GetMapping("")

    public List<Project> index(){
        return projectRepository.findAll();
    }

    @GetMapping("/{id}")

    public Project getById(@PathVariable Long id){
        return projectRepository.findById(id).get();
    }
*/
    @PostMapping("")

    public ResponseEntity<?> create(@RequestBody ProjectRequest projectRequest) {
        return ResponseEntity.ok().body(projectService.create(projectRequest));
    }

}
