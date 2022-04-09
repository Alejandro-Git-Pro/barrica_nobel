package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Unidad {

	@Id @GeneratedValue(strategy=GenerationType.AUTO , generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	private long id;
	private String nombrePack;
	private int cantidad;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombrePack() {
		return nombrePack;
	}
	public void setNombrePack(String nombrePack) {
		this.nombrePack = nombrePack;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Unidad [id=" + id + ", nombrePack=" + nombrePack + ", cantidad=" + cantidad + "]";
	}
	public Unidad(long id, String nombrePack, int cantidad) {
		super();
		this.id = id;
		this.nombrePack = nombrePack;
		this.cantidad = cantidad;
	}
	
	public Unidad() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
