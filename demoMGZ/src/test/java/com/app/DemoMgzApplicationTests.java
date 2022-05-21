package com.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = DemoMgzApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoMgzApplicationTests {

	
	@LocalServerPort
	private int port;	
	TestRestTemplate restTemplate = new TestRestTemplate();
	
	
	//@Test
	//public void greetingTest() {
		
		//String URL = "http://localhost:" + port + "/greeting?name=Mateo";
		//String restRequest = restTemplate.getForObject(URL, Greeting.class).getContent();
		
		//assertTrue(restRequest.equals("Hello, Mateo!"));
		
	//}

}