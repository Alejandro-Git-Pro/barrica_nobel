package com.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = DemoArav1Application.class, webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoArav1ApplicationTests {

	@LocalServerPort
	private int port;
	
	TestRestTemplate restTemplate = new TestRestTemplate();
	
	
	
	@Test
	void contextLoads() {
		
		String URL = "http://localhost:" + port + "/greeting?name=Juan";
		
		
		String restRequest = restTemplate.getForObject(URL, Greeting.class).getContent();
		
		assertTrue(restRequest.equals("Hello, Juan!"));
	}

}
