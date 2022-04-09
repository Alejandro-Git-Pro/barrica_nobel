package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Unidad;
import com.app.repository.UnidadCRUDRepository;
import com.app.repository.UnidadQUERYRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*") //https://www.baeldung.com/spring-cors
@RequestMapping("/api/unidadCustomAPI")
public class UnidadController {

	@Autowired
    private UnidadCRUDRepository unidadRepository;
	@Autowired
	// private UnidadQUERYRepository unidadRepositoryQuery;
	
	@CrossOrigin(origins = "*")
    @PostMapping(path= "/addunidad", consumes = "application/json", produces = "application/json")
	public Unidad addNewUnidadApi(@RequestBody Unidad unidad) {
        //add resource
     	unidad = unidadRepository.save(unidad);
		return unidad;
	}
}
