package spring.dp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.dp.models.Project;

import java.util.Optional;

@Repository
public interface ProjectsRepository extends JpaRepository<Project, Integer> {
}
