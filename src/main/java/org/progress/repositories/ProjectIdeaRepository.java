package org.progress.repositories;

import org.progress.entities.ProjectIdea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectIdeaRepository extends JpaRepository<ProjectIdea,Long> {
}
