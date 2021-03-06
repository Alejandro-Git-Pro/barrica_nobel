package com.app;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	private static final String template = " Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/start")
	@ResponseBody
	public String welcome() {
		return "Bienvenido a la IUE";
	}
	
	
	
	
}