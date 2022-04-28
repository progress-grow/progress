package org.progress.web;

import lombok.AllArgsConstructor;
import org.progress.entities.ProjectIdea;
import org.progress.repositories.ProjectIdeaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class ProjectIdeaController {

    private ProjectIdeaRepository pir;

    @GetMapping(path = "projectideas")
    public String projectIdea(Model model){
        List<ProjectIdea> projectIdeas = pir.findAll();
        model.addAttribute("listideas", projectIdeas);
        return "projectideas";
    }

}
