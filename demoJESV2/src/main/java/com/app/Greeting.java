package com.app;

public class Greeting {
	
	private Long id;
	private String nombre;
	private String direccion;
	private String descripcion;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Greeting [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", descripcion=" + descripcion
				+ "]";
	}
	
	
	
}
