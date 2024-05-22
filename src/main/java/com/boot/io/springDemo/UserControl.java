package com.boot.io.springDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControl {

    @GetMapping("/hello")
    public String hello(){
        return  "Spring Boot hello";
    }
}
