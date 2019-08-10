package com.jackcole.chronus;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * The main application startup
 */
@SpringBootApplication
@EnableScheduling
public class App implements CommandLineRunner {


    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
    }


}