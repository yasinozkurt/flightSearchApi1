package com.external.project.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {


    @GetMapping("/healthy")
    public ResponseEntity<String> checkHealth(){
        return ResponseEntity.status(HttpStatus.OK).body(" I am flightSearchApi and working alright");
    }
}
