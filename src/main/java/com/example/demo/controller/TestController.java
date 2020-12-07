package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/")
    public String home() {
        return "Spring boot is working!";
    }

    @RequestMapping("/random")
    public double random() {
        double x = Math.random();
        return x;
    }
}