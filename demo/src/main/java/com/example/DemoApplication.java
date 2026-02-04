package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

   @PostMapping("/api/login")
public String login(@RequestParam String username, @RequestParam String password) {
    if ("sanjay".equals(username) && "secret".equals(password)) {
        String token = JwtUtil.generateToken(username);
        return "Login successful! 🎉 JWT Token: " + token;
    } else {
        return "Invalid credentials ❌";
    }
}

    @GetMapping("/")
    public String hello() {
        return "Hello, Sanjay! Your Spring Boot app is running 🚀";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
