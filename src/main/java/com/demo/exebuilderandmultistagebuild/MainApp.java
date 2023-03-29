package com.demo.exebuilderandmultistagebuild;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class MainApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MainApp.class, args);

        // Execute journey and exit
        JourneyExecutorService executorService = context.getBean(JourneyExecutorService.class);
        if (executorService.executeJourney()) {
            log.info("Journey executed successfully! Exiting gracefully...");
            context.close();
        } else {
            log.error("Exiting with status code 1");
            System.exit(1);
        }
    }
}
