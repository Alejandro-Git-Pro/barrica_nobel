package com.app.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;


@Entity
public class Cliente {

	@Id @GeneratedValue(strategy=GenerationType.AUTO , generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	private long nit;
	private String tipoCliente;
	private String nombre; 
	private String apellido;
	private String genero;
	private String fechadenacimeinto;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nit=" + nit + ", tipoCliente=" + tipoCliente + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", genero=" + genero + ", fechadenacimeinto=" + fechadenacimeinto + "]";
	}
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
	
	
	
	