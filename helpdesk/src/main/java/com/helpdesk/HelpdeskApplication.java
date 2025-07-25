package com.helpdesk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelpdeskApplication {

	public static void main(String[] args) {
		System.out.println("the helpdesk application is running");
		SpringApplication.run(HelpdeskApplication.class, args);
	}

}
