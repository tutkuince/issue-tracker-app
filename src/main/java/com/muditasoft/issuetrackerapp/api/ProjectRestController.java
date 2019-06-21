package com.muditasoft.issuetrackerapp.api;

import com.muditasoft.issuetrackerapp.dto.ProjectDto;
import com.muditasoft.issuetrackerapp.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/projects")
@RestController
public class ProjectRestController {

    private final ProjectService projectService;

    public ProjectRestController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectDto> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(projectService.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<ProjectDto>> getAll() {
        List<ProjectDto> data = projectService.getAll();
        return ResponseEntity.ok(data);
    }
}
