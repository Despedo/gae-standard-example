package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication

public class DemoApplication {

    private static final Logger logger = Logger.getLogger(DemoApplication.class.getName());

    public static void main(String[] args) {
        logger.info("Application starting");
        SpringApplication.run(DemoApplication.class, args);
    }

}
