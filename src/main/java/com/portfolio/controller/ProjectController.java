package com.portfolio.controller;

import com.portfolio.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    // Projects page
    @GetMapping("/projects")
    public String projects(Model model) {

        model.addAttribute("projects", projectService.getProjects());

        return "projects"; // projects.html
    }
}