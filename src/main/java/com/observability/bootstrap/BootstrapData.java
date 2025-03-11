package com.observability.bootstrap;

import com.observability.entities.Project;
import com.observability.repositories.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class BootstrapData implements CommandLineRunner {
    private final ProjectRepository projectRepository;

    public BootstrapData(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public void run(String... args) throws Exception {
           projectRepository.saveAll(List.of(new Project("Java Project", LocalDate.of(1995,2,18)),
                  new Project("Spring Project",LocalDate.of(2003, 03, 10)),
                   new Project("Spring Boot Project",LocalDate.of(2008, 07, 21))));

    }
}
