package com.portfolio.model;

public class Experience {

    private String position;
    private String company;
    private String duration;
    private String description;

    // Constructor
    public Experience(String position, String company, String duration, String description) {
        this.position = position;
        this.company = company;
        this.duration = duration;
        this.description = description;
    }

    // Getters
    public String getPosition() { return position; }
    public String getCompany() { return company; }
    public String getDuration() { return duration; }
    public String getDescription() { return description; }
}