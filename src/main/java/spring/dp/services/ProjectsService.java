package spring.dp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.dp.models.Project;
import spring.dp.repositories.ProjectsRepository;
import spring.dp.util.ProjectNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class ProjectsService {
    private final ProjectsRepository projectsRepository;

    @Autowired
    public ProjectsService(ProjectsRepository projectsRepository) {
        this.projectsRepository = projectsRepository;
    }

    public List<Project> findAll() {
        return projectsRepository.findAll();
    }

    public Project findOne(int id) {
        Optional<Project> foundProject = projectsRepository.findById(id);
        return foundProject.orElseThrow(ProjectNotFoundException::new);
    }
    @Transactional
    public void save(Project project) {
        projectsRepository.save(project);
    }
    @Transactional
    public void update(int id, Project updatedProject) {
        updatedProject.setProject_id(id);
        projectsRepository.save(updatedProject);
    }

    @Transactional
    public void delete(int id) {
        projectsRepository.deleteById(id);
    }
}
