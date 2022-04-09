package com.app.entity;

import java.util.ArrayList;
import java.util.List;

public class Unidades {

	 private List<Unidad> UnidadList;
	    
	    public List<Unidad> getEmployeeList() {
	        if(UnidadList == null) {
	        	UnidadList = new ArrayList<>();
	        }
	        return UnidadList;
	    }
	 
	    public void setEmployeeList(List<Unidad> unidadList) {
	        this.UnidadList = unidadList;
	    }
}
