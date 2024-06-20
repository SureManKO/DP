package spring.dp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.dp.models.Project;
import spring.dp.services.ProjectsService;
import spring.dp.util.ProjectErrorResponse;
import spring.dp.util.ProjectNotFoundException;

import java.util.List;


@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectsService projectsService;

    @Autowired
    public ProjectController(ProjectsService projectsService) {
        this.projectsService = projectsService;
    }

    @GetMapping()
    public List<Project> getProjects(){
        return projectsService.findAll();
    }

    @GetMapping("/{id}")
    public Project getProject(@PathVariable ("id")int id){
        return projectsService.findOne(id);
    }
    @ExceptionHandler
    private ResponseEntity<ProjectErrorResponse> handleExceptions(ProjectNotFoundException e){
        ProjectErrorResponse response = new ProjectErrorResponse(
                "Нет такого проекта", System.currentTimeMillis()
        );
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
