package com.Beruon.PexDelivery.dto;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.ResourceSupport;

public class tblContactoMensajeroDto extends ResourceSupport implements Serializable{

	private Integer idContactoMensajero;
	private String contacto;
	private tblStatusDto statusDto;
	private tblTipoContactoDto tipoContactoDto;
	private tblMensajeroDto mensajeroDto;
	
	private static final long serialVersionUID = -5290198995172316155L;

	public Integer getIdContactoMensajero() {
		return idContactoMensajero;
	}

	public void setIdContactoMensajero(Integer idContactoMensajero) {
		this.idContactoMensajero = idContactoMensajero;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public tblStatusDto getStatusDto() {
		return statusDto;
	}

	public void setStatusDto(tblStatusDto statusDto) {
		this.statusDto = statusDto;
	}

	public tblTipoContactoDto getTipoContactoDto() {
		return tipoContactoDto;
	}

	public void setTipoContactoDto(tblTipoContactoDto tipoContactoDto) {
		this.tipoContactoDto = tipoContactoDto;
	}

	public tblMensajeroDto getMensajeroDto() {
		return mensajeroDto;
	}

	public void setMensajeroDto(tblMensajeroDto mensajeroDto) {
		this.mensajeroDto = mensajeroDto;
	}
	
	
}
