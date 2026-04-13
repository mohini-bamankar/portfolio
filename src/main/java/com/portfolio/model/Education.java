package com.portfolio.model;

public class Education {
    private String degree, college, year, percentage;

    public Education(String degree, String college, String year, String percentage) {
        this.degree = degree;
        this.college = college;
        this.year = year;
        this.percentage = percentage;
    }

    public String getDegree() { return degree; }
    public String getCollege() { return college; }
    public String getYear() { return year; }
    public String getPercentage() { return percentage; }
}