package com.portfolio.model;

public class Skill {

    private String name;
    private String details;

    public Skill(String name, String details) {
        this.name = name;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }
}