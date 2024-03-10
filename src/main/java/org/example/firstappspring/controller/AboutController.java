package org.example.firstappspring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Controller
public class AboutController {

    @GetMapping("/about")
    public String about() {

        return "about";
    }
}
