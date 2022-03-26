package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;


@SpringBootTest(classes = DemoLaqm1Application.class, webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoLaqm1ApplicationTests {
	
	@LocalServerPort
	private int port;	
	TestRestTemplate restTemplate = new TestRestTemplate();

	@Test
	void contextLoads() {
	}
	
	@Test
	public void greetingTest() {
		String URL = "http://localhost:" + port + "/greeting?name=Luis";
		String restRequest = restTemplate.getForObject(URL, Greeting.class).getContent();
		assertTrue(restRequest.equals("Hello, Luis!"));
	}

}
