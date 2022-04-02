package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Producto {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO , generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	public Long id;
	public String nombre;
	public Long precio;
	public LocalDate fechaCosecha;
	public LocalDate fechaEmbotellado;
	public LocalDate fechaRegistro;
	
	public Producto() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public LocalDate getFechaCosecha() {
		return fechaCosecha;
	}

	public void setFechaCosecha(LocalDate fechaCosecha) {
		this.fechaCosecha = fechaCosecha;
	}

	public LocalDate getFechaEmbotellado() {
		return fechaEmbotellado;
	}

	public void setFechaEmbotellado(LocalDate fechaEmbotellado) {
		this.fechaEmbotellado = fechaEmbotellado;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
	

}
