package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.logging.Logger;

@RestController
public class DemoController {

    private static final Logger logger = Logger.getLogger(DemoController.class.getName());

    @GetMapping("/")
    public String hello() {
        int random = new Random().nextInt(20);
        logger.info("Logging INFO with java.util.logging");
        logger.severe("Logging ERROR with java.util.logging");
        return "Hello world! Random is: " + random;
    }
}
