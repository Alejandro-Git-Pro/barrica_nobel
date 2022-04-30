package com.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(classes = DemoLaqm1Application.class, webEnvironment = WebEnvironment.RANDOM_PORT)
class DescuentoControllerTest {
	
	@LocalServerPort
	private int port;	
	TestRestTemplate restTemplate = new TestRestTemplate();

	@Test
	void contextLoads() {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void addNewDescTest() {
		String URL = "http://localhost:" + port + "api/descuento/adddesc";
		String restRequest = restTemplate.getForObject(URL, Greeting.class).getContent();
		assertTrue(restRequest.equals("Hello, Luis!"));
	}

}
