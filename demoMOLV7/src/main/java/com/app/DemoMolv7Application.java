package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.app")
@SpringBootApplication

public class DemoMolv7Application {

	
	public static void main(String[] args) {
		SpringApplication.run(DemoMolv7Application.class, args);
	}

}
