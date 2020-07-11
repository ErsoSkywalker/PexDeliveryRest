package com.Beruon.PexDelivery.dto;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.ResourceSupport;

public class tblTamanoDto extends ResourceSupport implements Serializable{

	private static final long serialVersionUID = -5290198995172316155L;
	private Integer idTamano;
	private String tamano;
	public Integer getIdTamano() {
		return idTamano;
	}
	public void setIdTamano(Integer idTamano) {
		this.idTamano = idTamano;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	
	
	
}
