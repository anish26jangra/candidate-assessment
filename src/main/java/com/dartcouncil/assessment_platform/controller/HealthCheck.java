package com.dartcouncil.assessment_platform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/home")
    public String healthCheck(){
        return "Welcome to the assessment platform";
    }
}
