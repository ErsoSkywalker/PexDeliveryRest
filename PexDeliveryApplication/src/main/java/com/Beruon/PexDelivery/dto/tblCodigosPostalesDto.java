package com.Beruon.PexDelivery.dto;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.ResourceSupport;

public class tblCodigosPostalesDto extends ResourceSupport implements Serializable{

	private static final long serialVersionUID = -5290198995172316155L;
	
	private Integer idCodigoPostal;
	private String codigoPostal;
	
	public tblCodigosPostalesDto() {
		
	}
	
	public tblCodigosPostalesDto(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	public Integer getIdCodigoPostal() {
		return idCodigoPostal;
	}
	public void setIdCodigoPostal(Integer idCodigoPostal) {
		this.idCodigoPostal = idCodigoPostal;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
	
	
}
