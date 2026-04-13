package com.portfolio.controller;

import com.portfolio.model.Project;
import com.portfolio.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @Autowired private ProjectService projectService;
    @Autowired private EducationService educationService;
    @Autowired private ExperienceService experienceService;
    @Autowired private CertificateService certificateService;
    @Autowired private SkillService skillService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Mohini Bamankar");
        model.addAttribute("role", "Software Engineer | Java & Python Developer | AI & IoT Enthusiast");

        // Fetching from all services
        model.addAttribute("projects", projectService.getProjects());
        model.addAttribute("experienceList", experienceService.getExperienceList());
        model.addAttribute("educationList", educationService.getEducationList());
        model.addAttribute("skills", skillService.getSkills());
        model.addAttribute("certificates", certificateService.getCertificates());

        return "index";
    }

    @GetMapping("/project/{id}")
    public String projectDetails(@PathVariable int id, Model model) {
        Project project = projectService.getProjectById(id);

        // Critical Fix: If project is null, redirect so the template doesn't crash
        if (project == null) {
            return "redirect:/";
        }

        model.addAttribute("project", project);
        return "project-details";
    }
}