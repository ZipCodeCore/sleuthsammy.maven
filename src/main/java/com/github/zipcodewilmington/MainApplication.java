package com.github.zipcodewilmington;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by leon on 2/5/18.
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        new JPAConfigurator().init();
        SpringApplication.run(MainApplication.class, args);
    }
}