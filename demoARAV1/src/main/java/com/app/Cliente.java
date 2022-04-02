package com.app;
import java.util.UUID;

public class Cliente {

	private UUID id;
	private long nit;
	private String tipoCliente;
	private String nombre; 
	private String apellido;
	private String genero;
	private String fechadenacimeinto;
	
	
	
	
	
	
	
	public Cliente(UUID id, long nit, String tipoCliente, String nombre, String apellido, String genero,
			String fechadenacimeinto) {
		super();
		this.id = id;
		this.nit = nit;
		this.tipoCliente = tipoCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.fechadenacimeinto = fechadenacimeinto;
	}
	
	
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public long getNit() {
		return nit;
	}
	public void setNit(long nit) {
		this.nit = nit;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getFechadenacimeinto() {
		return fechadenacimeinto;
	}
	public void setFechadenacimeinto(String fechadenacimeinto) {
		this.fechadenacimeinto = fechadenacimeinto;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
