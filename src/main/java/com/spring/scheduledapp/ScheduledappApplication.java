package com.spring.scheduledapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class ScheduledappApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduledappApplication.class, args);
    }

}
