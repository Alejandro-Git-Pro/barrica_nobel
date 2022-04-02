package com.app.entity;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Descuento {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO , generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	private long id;
	private Date FechaInicial;
	private Date FechaFinal;
	//private Producto productos[];
	private Double descuento;
		
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Double getDescuento() {
		return descuento;
	}
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	public Date getFechaInicial() {
		return FechaInicial;
	}
	public void setFechaInicial(Date fechaInicial) {
		FechaInicial = fechaInicial;
	}
	public Date getFechaFinal() {
		return FechaFinal;
	}
	public void setFechaFinal(Date fechaFinal) {
		FechaFinal = fechaFinal;
	}
	
	/*
	public Producto[] getProductos() {
		return productos;
	}
	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
	*/
	
	

}
