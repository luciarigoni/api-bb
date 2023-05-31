package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/pessoa")
    public String hello() {
        return "Hello, Spring Boot";
    }
}
