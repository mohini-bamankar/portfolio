package com.portfolio.service;

import com.portfolio.model.Skill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    public List<Skill> getSkills() {
        return List.of(

                new Skill("Programming Languages", "Java, Python, C/C++, JavaScript"),

                new Skill("Frameworks & Libraries", "Spring Boot, Angular, TensorFlow, OpenCV, Scikit-Learn, NumPy, Pandas "),

                new Skill("Web Technologies", "HTML, CSS, Bootstrap, REST APIs"),

                new Skill("Cloud & Databases", "AWS (S3, RDS), MySQL"),

                new Skill("Tools & Platforms", "Git, GitHub"),

                new Skill("Core Concepts", "Object-Oriented Programming (OOP), Data Structure, Java Swing, Agile Methodology")

        );
    }
}