package com.karthik.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {


    @GetMapping("/userServiceFallback")
    public String userServiceFallBack(){
        return "User service is taking longer than expected. Please try again!";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallBack(){
        return "Department service is taking longer than expected. Please try again!";
    }
}
