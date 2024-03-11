package com.gl.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Annotation to indicate that this class serves as a RESTful controller
@RestController
public class HelloController {

    // This method handles HTTP GET requests for the "/hello" endpoint
    @GetMapping("hello")
    public String hello() {
        // Returns a simple "Hello...Motttooo..." response
        return "Hello...Motttoo...";
    }
}



/*
 * Execution links for this code
 * http://localhost:8087/hello
 * http://localhost:8087/actuator/
 * http://localhost:8087/actuator/info
 * http://localhost:8087/actuator/health
 * 
 * for customized path
 * http://localhost:8087/app/health
 * .
 * .
 * .so on
 * */
