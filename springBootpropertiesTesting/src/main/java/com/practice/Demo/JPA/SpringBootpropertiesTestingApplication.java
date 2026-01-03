package com.practice.Demo.JPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.primaryQualifier.MyComponent;

@SpringBootApplication
@ComponentScan({"com.practice.Demo.JPA", "com.primaryQualifier"})
public class SpringBootpropertiesTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootpropertiesTestingApplication.class, args);
	}
	
	
	@Bean
    CommandLineRunner run(MyComponent myComponent) {
        return args -> myComponent.printDataSource();
	}

}
