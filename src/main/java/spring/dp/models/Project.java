package spring.dp.models;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "project")
public class Project {
     @Id
     @Column(name = "project_id")
     @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int project_id;

    @Column(name = "customer_id")
        private int customer_id;

    @Column(name = "project_status_id")
        private int project_status_id;

    @Column(name = "project_direction_id")
        private int project_direction_id;

    @Column(name = "project_name")
        private String project_name;

    @Column(name = "project_description")
    private String project_description;

    @Column(name = "project_start")
    private LocalDate project_start;

    @Column(name = "project_end")
    private LocalDate project_end;


    // Конструктор по умолчанию нужен для Spring
        public Project() {
        }

    public int getProject_id() {
        return project_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public int getProject_status_id() {
        return project_status_id;
    }

    public int getProject_direction_id() {
        return project_direction_id;
    }

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

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }


    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public void setProject_direction_id(int project_direction_id) {
        this.project_direction_id = project_direction_id;
    }

    public void setProject_status_id(int project_status_id) {
        this.project_status_id = project_status_id;
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
