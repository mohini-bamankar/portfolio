package com.portfolio.service;

import com.portfolio.model.Experience;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {

    public List<Experience> getExperienceList() {
        return List.of(

                new Experience(
                        "Software Engineer",
                        "Innovatus Technology, Pune",
                        "July 2024 - Present",
                        "Specializes in developing IT solutions and software services.\n\n\n" +
                                "\tDeveloped and maintained backend services using Java & Spring Boot.\n\n" +
                                "\tDesigned and implemented REST APIs for scalable applications.\n\n" +
                                "\tBuilt responsive frontend components using Angular.\n\n" +
                                "\tManaged databases using MySQL and cloud storage using AWS S3.\n\n" +
                                "\tImproved system performance by 20% through optimization.\n\n" +
                                "\tReduced API response time by 30%\n."
                )

        );
    }
}