package com.guide.demoproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return  "Welcome to Spring Boot Project.....Live...Reload";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World App Api";
    }

}
