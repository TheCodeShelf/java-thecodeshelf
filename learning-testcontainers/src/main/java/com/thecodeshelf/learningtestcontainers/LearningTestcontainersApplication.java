package com.thecodeshelf.learningtestcontainers;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@RequiredArgsConstructor
@EnableMongoRepositories
public class LearningTestcontainersApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningTestcontainersApplication.class, args);
	}

}
