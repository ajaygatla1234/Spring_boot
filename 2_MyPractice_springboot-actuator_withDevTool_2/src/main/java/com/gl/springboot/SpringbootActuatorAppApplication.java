package com.gl.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

// Annotation to indicate that this class is a Spring Boot application
@SpringBootApplication

// Enable auto-configuration of the Spring application context
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})

// Specifies the base package(s) to scan for Spring components like controllers
@ComponentScan(basePackages = {"com.gl.springboot.controller"})
public class SpringbootActuatorAppApplication {

    // Main method to start the Spring Boot application
    public static void main(String[] args) {
        SpringApplication.run(SpringbootActuatorAppApplication.class, args);
    }

}
