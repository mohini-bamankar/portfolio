package com.portfolio.service;

import com.portfolio.model.Education;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {

    public List<Education> getEducationList() {
        return List.of(

                new Education(
                        "B.Tech - Electronics & Telecommunication",
                        "N B Navale College of Engineering, Solapur",
                        "Aug 2019 - Aug 2023",
                        "91.67%"
                ),

                new Education(
                        "HSC - Higher Secondary Certificate",
                        "Walchand College of Arts & Science, Solapur",
                        "Year Not Specified",
                        "72.63%"
                )

        );
    }
}