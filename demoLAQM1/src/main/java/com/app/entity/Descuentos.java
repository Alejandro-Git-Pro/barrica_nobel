package com.app.entity;

import java.util.ArrayList;
import java.util.List;

public class Descuentos {
	
	private List<Descuento> listaDescuento;
	
	public List<Descuento> getListaDescuento(){
		if (listaDescuento == null) {
			listaDescuento = new ArrayList<>();
		}
		return listaDescuento;
	}

	public void setListaDescuento(List<Descuento> listaDescuento) {
		this.listaDescuento = listaDescuento;
	}

}
