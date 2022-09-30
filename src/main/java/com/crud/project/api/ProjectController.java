package com.crud.project.api;


import com.crud.project.entity.Project;
import com.crud.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/project")
@CrossOrigin(origins = "*")

public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService){
        this.projectService = projectService;
    }
    @GetMapping("")

    public ResponseEntity<List<Project>> index(){
        return ResponseEntity.ok().body(projectService.findAll());
    }

    @GetMapping("/{id}")

    public ResponseEntity<Project> getById(@PathVariable Long id){
        return ResponseEntity.ok().body(projectService.findById(id));
    }

    @DeleteMapping("/{id}")

    public ResponseEntity<Long> deleteById(@PathVariable Long id){
        return ResponseEntity.ok().body(projectService.delete(id));
    }

    @PostMapping("")

    public ResponseEntity<?> create(@RequestBody Project project) {
        return ResponseEntity.ok().body(projectService.create(project));
    }

    @PutMapping ("")

    public ResponseEntity<Project> update(@RequestBody Project project) {
        return ResponseEntity.ok().body(projectService.update(project));
    }

}
