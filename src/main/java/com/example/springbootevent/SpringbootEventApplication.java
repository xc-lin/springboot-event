package com.example.springbootevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SpringbootEventApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEventApplication.class, args);
    }

}
