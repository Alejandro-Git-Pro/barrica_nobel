package com.app.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	@CrossOrigin(origins = "*")
	@PostMapping(path = "/Clienteadd", consumes = "application/json", produces = "application/json")
	public Cliente addNewCliente(@RequestBody Cliente cliente) {
		cliente = ClienteRepository.save(cliente);
		return cliente;
	}
	
	
	@CrossOrigin(origins = "*")
	@PutMapping(path = "/Clienteupdate")
	public Cliente updateCliente(@RequestBody Cliente cliente) {
		ClienteRepository.saveAndFlush(cliente);
		return cliente;
	}
	
	@CrossOrigin(origins = "*")
	@DeleteMapping(path = "/Clientedelete/{id}")
	public String delenteCliente(@PathVariable Long id) {
		ClienteRepository.deleteById(id);
		return "eliminado";
	}

}
