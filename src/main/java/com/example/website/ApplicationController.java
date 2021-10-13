package com.example.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/")
    public String homepage() {
        return "home";
    }
}