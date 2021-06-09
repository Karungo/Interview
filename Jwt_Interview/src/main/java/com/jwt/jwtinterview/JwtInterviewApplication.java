package com.jwt.jwtinterview;

import com.jwt.jwtinterview.services.DatabaseSeeder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JwtInterviewApplication {
    @Autowired
    DatabaseSeeder databaseSeeder;
    @PostConstruct
    public void seed() {
        databaseSeeder.SeedData();
    }
    public static void main(String[] args) {
        SpringApplication.run(JwtInterviewApplication.class, args);
    }

}
