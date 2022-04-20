package com.app.controller;

import java.net.URI;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.app.entity.Descuento;
import com.app.entity.Descuentos;
import com.app.repository.DescuentoCRUDRepository;
import com.app.repository.DescuentoQUERYRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/descuento")
public class DescuentoController {

	@Autowired
	private DescuentoCRUDRepository descRep;
	@Autowired
	private DescuentoQUERYRepository descQueryRep;
	
	@CrossOrigin(origins = "*")
	@PostMapping(path = "/adddesc", consumes = "application/json", produces = "application/json")
	public Descuento addNewDesc(@RequestBody Descuento descuento) {
		descuento = descRep.save(descuento);
		return descuento;
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(path = "/getalldesc", produces = "application/json")
	public Descuentos getAllDescs() {
		Descuentos response = new Descuentos();
		ArrayList<Descuento> list = new ArrayList<>();
		descRep.findAll().forEach(e -> list.add(e));
		response.setListaDescuento(list);
		return response;
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(path = "/updatedesc", consumes = "application/json", produces = "application/json")
	public Descuento updateDesc(@RequestBody Descuento descuento) {
		descRep.save(descuento);
		return descuento;
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(path = "/removedesc", consumes = "application/json")
	public @ResponseBody ResponseEntity<String> deleteDesc(@RequestBody Descuento descuento){
		descRep.deleteById(descuento.getId());
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@GetMapping(path="	", produces = "application/json")
	public Descuentos getDescs() {
		Descuentos response = new Descuentos();
		ArrayList<Descuento> list = new ArrayList<>();
		descRep.findAll().forEach(e -> list.add(e));
		response.setListaDescuento(list);
		return response;
	}
	
	@PostMapping(path= "/descuentos", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> addDesc(@RequestBody Descuento descuento){
		descuento = descRep.save(descuento);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
						.path("/{id}")
						.buildAndExpand(descuento.getId())
						.toUri();
		return ResponseEntity.created(location).build();
	}
}
