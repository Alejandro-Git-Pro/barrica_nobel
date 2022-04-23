package com.app.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entity.Cliente;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*") //https://www.baeldung.com/spring-cors
@RequestMapping("/api/ClienteCustomAPI")
public class Clientecontroller {
	
	@Autowired
    private com.app.repository.ClienteRepository ClienteRepository;

	@CrossOrigin(origins = "*")
    @GetMapping(path= "/Clientegetall", produces = "application/json")
    public List<Cliente> getAllClientesApi() 
    {
		return ClienteRepository.findAll();
    }
	

}
