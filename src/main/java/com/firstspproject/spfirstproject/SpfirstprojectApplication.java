package com.firstspproject.spfirstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // = @Configuration, @EnableAutoConfiguration, @ComponentScan
public class SpfirstprojectApplication {

	public static void main(String[] args) {
		// ConfigurableApplicationContext
		SpringApplication.run(SpfirstprojectApplication.class, args);
	}
}

