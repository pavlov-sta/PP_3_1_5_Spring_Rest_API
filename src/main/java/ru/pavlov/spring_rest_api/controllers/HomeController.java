package ru.pavlov.spring_rest_api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/user")
    public String userPage(){
        return "user";
    }
    @GetMapping("/admin")
    public String adminPage(){
        return "admin";
    }
}
