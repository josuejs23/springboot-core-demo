package com.josuejs23.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* To scan others packages
//@SpringBootApplication(
//		scanBasePackages = {"com.josuejs23.springcoredemo", "com.josuejs23.util"}
)*/
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
