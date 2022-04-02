package com.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = DemoJgpv1Application.class, webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoJgpv1ApplicationTests {

	
	@LocalServerPort
	private int port;	
	TestRestTemplate restTemplate = new TestRestTemplate();
	
	
	@Test
	void firstTestHolaMundo() {
		// (Escenario)
		// (Given) some context
		// (When) some action is carried out
		// (Then) a particular set of observable consequences should obtain

		/*
		 * Un ejemplo: Retiro de un Cajero Dado que mi cuenta bancaria tiene crédito y
		 * no hice retiros recientemente, Cuando intento retirar una cantidad menor que
		 * el límite de mi tarjeta, Entonces el retiro debe completarse sin errores ni
		 * advertencias. // JBehave, RSpec o Cucumber
		 * https://openwebinars.net/blog/que-es-gherkin/
		 */
				
		// Escenario 1: Realizo el llamado a la URL me saluda con mi nombre
		// GIVEN: Dado que el servicio puede ser llamado desde una URL enviando mi
		// nombre
		// WHEN: Cuando invoco la URL
		// THEN: El servicio responde el Saludo con mi nombre: Hello, Juan!
		
		String URL = "http://localhost:" + port + "/greeting?name=Juan!";

		// WHEN: Cuando invoco la URL
		//String restRequest = restTemplate.getForObject(URL, Greeting.class).getContent();
		String restRequest = restTemplate.withBasicAuth("admin","123456789").getForObject(URL, Greeting.class).getContent();
		
		// THEN: El servicio responde el Saludo con mi nombre: Hello, Juan!
		assertTrue(restRequest.equals("Hello, Juan!!"));
		
		
		
		
	}

}
