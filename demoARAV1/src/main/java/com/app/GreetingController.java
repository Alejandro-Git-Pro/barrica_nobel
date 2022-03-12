package com.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/start")
	@ResponseBody
	public String welcome() {
		return "Bienvenido a la IUE 2.0";
	}
	
}
