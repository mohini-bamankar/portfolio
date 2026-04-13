package com.portfolio.model;

public class Certificate {

    private String name;
    private String issuer;
    private String imagePath; // path to jpg

    public Certificate(String name, String issuer, String imagePath) {
        this.name = name;
        this.issuer = issuer;
        this.imagePath = imagePath;
    }

    public String getName() { return name; }
    public String getIssuer() { return issuer; }
    public String getImagePath() { return imagePath; }
}