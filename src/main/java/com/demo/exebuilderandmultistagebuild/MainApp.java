package com.demo.exebuilderandmultistagebuild;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class MainApp {

    public static void main(String[] args) {
        try {
            ConfigurableApplicationContext context = SpringApplication.run(MainApp.class, args);

            // Execute journey
            JourneyExecutorService executorService = context.getBean(JourneyExecutorService.class);
            if (executorService.executeJourney()) {
                log.info("Journey executed successfully!");
            } else {
                log.error("Error occurred");
            }
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(e);
        } finally {
            holdTerminal();
        }
    }

    private static void holdTerminal() {
        while(true) {
        }
    }
}
