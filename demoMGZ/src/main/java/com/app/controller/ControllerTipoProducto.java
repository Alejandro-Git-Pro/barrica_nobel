package com.app.controller;


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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.TipoProducto;
import com.app.repository.TipoProductoRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/TipoProducto")
public class ControllerTipoProducto {

	@Autowired
	private TipoProductoRepository tipoProductoRepository;
	
	//"http://localhost:8080/api/tipoproducto"
	//GET
	
	@CrossOrigin(origins = "*")
	@PostMapping
	public Object AgregarProducto(@RequestBody TipoProducto t) 
	{
		return tipoProductoRepository.save(t);
		
	}
	
	@CrossOrigin(origins = "*")
	
	@GetMapping (path= "/getTipoProductos" , produces="application/json")
	public List<TipoProducto> getTipoProductos()
	{	
		return tipoProductoRepository.findAll();
	} 
	
	@CrossOrigin(origins = "*")
	@DeleteMapping(value = "/{id}")
	public void EliminarProducto(@PathVariable long id) {
		tipoProductoRepository.deleteById(id);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping( value = "/{id}")
	public Object getProducto(@PathVariable long id) {
		return tipoProductoRepository.findById(id);
	}
	@CrossOrigin(origins = "*")
	@PutMapping
	public void ActualizarProducto(@RequestBody TipoProducto t) {
		tipoProductoRepository.saveAndFlush(t);
	}

}
