package com.example.mypetproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.mypetproject.model", "com.example.mypetproject.config", "com.example.mypetproject.controller", "com.example.mypetproject.dto", "com.example.mypetproject.repository", "com.example.mypetproject.service"})
@EnableJpaRepositories
public class MyPetProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyPetProjectApplication.class, args);
    }

}
