package com.example.Lab6.controllers;

import com.example.Lab6.model.Project;
import com.example.Lab6.repository.ProjectRepostitory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    private final ProjectRepostitory repostitory;

    public ProjectController(ProjectRepostitory repostitory) {
        this.repostitory = repostitory;
    }
    @GetMapping
    public List<Project> findAll(){
        return repostitory.findAll();
    }
}
