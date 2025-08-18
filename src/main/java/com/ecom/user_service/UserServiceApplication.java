package com.ecom.user_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);

        System.out.println("Server Started Successfully");
        System.out.println("User Service is running on port 9090");
	}

}
