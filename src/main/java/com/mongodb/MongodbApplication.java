package com.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.mongodb.repository")
@EntityScan("com.mongodb.*")
public class MongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}

}
