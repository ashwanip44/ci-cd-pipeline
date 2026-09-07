package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public record RestControllerClass() {

    @GetMapping("/api/welcome")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Welcome to the Spring Boot REST API!");
    }

    @GetMapping("/api/welcome/{name}")
    public ResponseEntity<String> welcomeWithName(String name) {
        return ResponseEntity.ok("Welcome to the Spring Boot REST API, " + name + "!");
    }
}
