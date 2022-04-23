package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.app")
public class DemoArav1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoArav1Application.class, args);
	}

}
