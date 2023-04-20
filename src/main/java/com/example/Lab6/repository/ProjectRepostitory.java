package com.example.Lab6.repository;

import com.example.Lab6.model.Project;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProjectRepostitory {
    List<Project> projects = new ArrayList<>();
    public ProjectRepostitory(){
        projects.add(new Project("proj1", "Hello", "www.example.com"));
        projects.add(new Project("proj2", "AISS", "www.example2.com"));
        projects.add(new Project("proj3", "AISSBlll", "www.example2.com"));
    }

    public List<Project> findAll(){
        return projects;
    }

}
