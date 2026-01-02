package com.blogapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the Blog Management Application.
 * This Spring Boot application provides REST APIs for managing blog users and operations.
 */
@SpringBootApplication
public class BlogManagementApplication {

	/**
	 * Main method to start the Spring Boot application.
	 *
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(BlogManagementApplication.class, args);
	}

}
