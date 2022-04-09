package com.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(classes = DemoMolv7Application.class, webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoMolv7ApplicationTests {

	@LocalServerPort
	private int port;	
	TestRestTemplate restTemplate = new TestRestTemplate();

	@Test
	void contextLoads() {
	}
	
	@Test
	public void greetingTest() {
		String URL = "http://localhost:" + port + "/greeting?name=TEO";
		String restRequest = restTemplate.getForObject(URL, Greeting.class).getContent();
		assertTrue(restRequest.equals("Hello, TEO!"));
	}
}
