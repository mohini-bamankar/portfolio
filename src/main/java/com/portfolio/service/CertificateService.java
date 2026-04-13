package com.portfolio.service;

import com.portfolio.model.Certificate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateService {

    private final List<Certificate> certificates = List.of(
            new Certificate("Bachelor of Technology",
                    "PAH Solapur University",
                    "/Btech.jpg"),
            new Certificate("Python 101 for Data Science",
                    "IBM Cognitive Class 2026",
                    "/IBM.jpg"),
            new Certificate("Full Stack Java Developer",
                    "Mind script Tech, Pune 2025",
                    "/Mindscript.jpg"),
            new Certificate("Agile Methodology Program ",
                    "Cognizant (Forage) 2025",
                    "/Cognizant.jpg"),
            new Certificate("AI with Python",
                    "FUEL For Nation, Pune 2024",
                    "/FUEL.jpg"),
            new Certificate("Campus Leader Internship",
                    "TechLearn 2024",
                    "/Techlearn.live.jpg")
    );

    public List<Certificate> getCertificates() {
        return certificates;
    }
}