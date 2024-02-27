package com.example.CourseReviewApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import Service.Data;

@EnableMongoRepositories(basePackages = "repo")
@SpringBootApplication(scanBasePackages = {"com.example.CourseReviewApp","Service"})
public class CourseReviewAppApplication{

	private Data data = new Data(null, null,null);
 
    public static void main(String[] args) {
        SpringApplication.run(CourseReviewAppApplication.class, args);
    }

}
