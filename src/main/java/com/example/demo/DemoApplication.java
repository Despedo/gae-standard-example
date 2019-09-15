package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class DemoApplication {

    private static final Logger logger = Logger.getLogger(DemoApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        double random = Math.random();
        logger.info("Logging INFO with java.util.logging");
        logger.severe("Logging ERROR with java.util.logging");
        return "hello world!";
    }

}
