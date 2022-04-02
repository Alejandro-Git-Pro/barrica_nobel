package com.app;

/**
@SpringBootTest(classes = MiSintomaBackApplication.class, 
		webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeControllerIntegrationTests 
{
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Sql({ "classpath:schema.sql", "classpath:data.sql" })
	@Test
	public void testAllEmployees() 
	{
				
		assertTrue(
				this.restTemplate
					.getForObject("http://localhost:" + port + "/api/employeeCustomAPI/employees", Employees.class)
					.getEmployeeList().size() == 1);
	}

	@Test
	public void testAddEmployee() 
	{
		Employee employee = new Employee("Lokesh", "Gupta", "abc@gmail.com");
		
		ResponseEntity<String> responseEntity = this.restTemplate
			.postForEntity("http://localhost:" + port + "/api/employeeCustomAPI/employees", employee, String.class);

		assertEquals(201, responseEntity.getStatusCodeValue());
	}

}*/
