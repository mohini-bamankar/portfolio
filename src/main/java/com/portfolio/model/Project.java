package com.portfolio.model;

public class Project {
    private int id;
    private String title;
    private String summary;
    private String description;
    private String githubLink;

    // Constructor
    public Project(int id, String title, String summary, String description, String githubLink) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.description = description;
        this.githubLink = githubLink;
    }

    // CRITICAL: You must have these Getters for Thymeleaf to work
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getSummary() { return summary; }
    public String getDescription() { return description; }
    public String getGithubLink() { return githubLink; }

    // Optional: Setters
    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setSummary(String summary) { this.summary = summary; }
    public void setDescription(String description) { this.description = description; }
    public void setGithubLink(String githubLink) { this.githubLink = githubLink; }
}