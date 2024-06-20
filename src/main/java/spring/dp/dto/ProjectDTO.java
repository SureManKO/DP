package spring.dp.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class ProjectDTO {

    private String project_name;

    private String project_description;

    private LocalDate project_start;

    private LocalDate project_end;

    public String getProject_name() {
        return project_name;
    }

    public LocalDate getProject_end() {
        return project_end;
    }

    public String getProject_description() {
        return project_description;
    }

    public LocalDate getProject_start() {
        return project_start;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }


    public void setProject_description(String project_description) {
        this.project_description = project_description;
    }

    public void setProject_start(LocalDate project_start) {
        this.project_start = project_start;
    }

    public void setProject_end(LocalDate project_end) {
        this.project_end = project_end;
    }
}
