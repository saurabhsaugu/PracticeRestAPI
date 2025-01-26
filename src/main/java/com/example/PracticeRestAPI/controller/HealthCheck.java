package com.example.PracticeRestAPI.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/")
    public String healthCheck(HttpServletRequest httpServletRequest){
        return "API Demo Application is Up and Running!!! Session Id: " + httpServletRequest.getSession().getId();
    }
}