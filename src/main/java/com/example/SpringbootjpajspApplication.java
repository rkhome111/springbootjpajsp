package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value="test")
//@Configuration
//@EnableAutoConfiguration
public class SpringbootjpajspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjpajspApplication.class, args);
	}
}
