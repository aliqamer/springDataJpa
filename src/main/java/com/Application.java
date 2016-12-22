package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Ali on 12/22/2016.
 */

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan({"com.example.model", "com.example.controller"})
@SpringBootApplication
@EnableJpaRepositories({"com.example.model"})
@EntityScan("com/example/model")
public class Application {

    public static void main(String args[]) {

        SpringApplication.run(Application.class, args);
    }
}
