package com.capstone.getFit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan (basePackages = "com.capstone")
public class GetFitApplication extends SpringBootServletInitializer {
	
	
	public static void main(String[] args) {
		SpringApplication.run(GetFitApplication.class, args);
	}

}
