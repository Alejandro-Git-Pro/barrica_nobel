package com.app.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="tipo_producto")
public class TipoProducto {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO , generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id; 
	private String referencia;
	private String nombre;
	private String color;
	private String edad;
	private String NivelAzucar;
	private String cepa;
	private String crianza;
	private String MetodoElaboracion;
	
	public TipoProducto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getNivelAzucar() {
		return NivelAzucar;
	}

	public void setNivelAzucar(String nivelAzucar) {
		NivelAzucar = nivelAzucar;
	}

	public String getCepa() {
		return cepa;
	}

	public void setCepa(String cepa) {
		this.cepa = cepa;
	}

	public String getCrianza() {
		return crianza;
	}

	public void setCrianza(String crianza) {
		this.crianza = crianza;
	}

	public String getMetodoElaboracion() {
		return MetodoElaboracion;
	}

	public void setMetodoElaboracion(String metodoElaboracion) {
		MetodoElaboracion = metodoElaboracion;
	} 
	

	

}
