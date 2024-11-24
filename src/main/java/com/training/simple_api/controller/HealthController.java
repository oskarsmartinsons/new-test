package com.training.simple_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public ResponseEntity<?> health(){
        System.out.println("Up and running!");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
