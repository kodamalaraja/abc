package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	private String b;
    public static void main(String[] args) {
    	
        SpringApplication.run(Application.class, args);
    }

}