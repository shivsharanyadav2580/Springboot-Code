package com.telusko.rest;

import com.telusko.service.IgrretingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final Logger log = LoggerFactory.getLogger(GreetingController.class);

    @Autowired
    private IgrretingService service;

    @GetMapping("/api1")
    public ResponseEntity<String> generateGreetings() {
        log.info("Our logger in api 1");

        String body = service.generateWishes();
        log.debug("Our log using debug");

        return new ResponseEntity<>(body, HttpStatus.OK);
    }
}