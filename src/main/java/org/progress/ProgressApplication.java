package org.progress;

import org.progress.entities.ProjectIdea;
import org.progress.repositories.OwnerRepository;
import org.progress.repositories.ProjectIdeaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProgressApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProgressApplication.class, args);

    }

    @Bean
    CommandLineRunner commandLineRunner(ProjectIdeaRepository projectIdeaRepository){

        return args -> {
            projectIdeaRepository.save(new ProjectIdea(null, "save planet", "save planet earth"));
            projectIdeaRepository.save(new ProjectIdea(null, "save tunisia", "save our country"));
            projectIdeaRepository.findAll().forEach(projectIdea -> {
                System.out.println(projectIdea.getSummary());
            });
        };

    }

}
