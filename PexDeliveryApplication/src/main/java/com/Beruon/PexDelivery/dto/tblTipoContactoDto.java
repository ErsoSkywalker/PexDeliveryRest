package com.Beruon.PexDelivery.dto;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.ResourceSupport;

public class tblTipoContactoDto extends ResourceSupport implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5290198995172316155L;

	private Integer idTipoContacto;
	private String tipoContacto;
	public Integer getIdTipoContacto() {
		return idTipoContacto;
	}
	public void setIdTipoContacto(Integer idTipoContacto) {
		this.idTipoContacto = idTipoContacto;
	}
	public String getTipoContacto() {
		return tipoContacto;
	}
	public void setTipoContacto(String tipoContacto) {
		this.tipoContacto = tipoContacto;
	}
	
	
	
	
}
