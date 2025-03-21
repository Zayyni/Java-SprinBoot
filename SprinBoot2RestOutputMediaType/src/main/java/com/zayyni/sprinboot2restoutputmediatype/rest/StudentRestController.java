package com.zayyni.sprinboot2restoutputmediatype.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {

    @GetMapping("/sa")
    public String showA(){
        return "WELCOME";
    }

    @GetMapping("/sb")
    public ResponseEntity<String> showB(){
        return new ResponseEntity<String>("WELCOME", HttpStatus.OK);
    }
}
