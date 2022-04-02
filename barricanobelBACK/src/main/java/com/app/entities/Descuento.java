package com.app.entities;

import java.util.Arrays;
import java.util.Date;

public class Descuento {
	
	private Date FechaInicial;
	private Date FechaFinal;
	private Producto productos[];
	Double descuento;
	
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
	public Producto[] getProductos() {
		return productos;
	}
	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
	
	public Descuento(Date fechaInicial, Date fechaFinal, Producto[] productos, Double descuento) {
		super();
		FechaInicial = fechaInicial;
		FechaFinal = fechaFinal;
		this.productos = productos;
		this.descuento = descuento;
	}
	
	public Descuento() {
		
	}
	
	@Override
	public String toString() {
		return "Descuento [FechaInicial=" + FechaInicial + ", FechaFinal=" + FechaFinal + ", productos="
				+ Arrays.toString(productos) + ", descuento=" + descuento + "]";
	}
	
	

}
