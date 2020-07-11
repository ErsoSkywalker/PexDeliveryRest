package com.Beruon.PexDelivery.dto;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.ResourceSupport;

public class tblContactosPersonaDto extends ResourceSupport implements Serializable{

	private Integer idContactoPersona;
	private String contacto;
	private tblStatusDto statusDto;
	private tblTipoContactoDto tipoContactoDto;
	private tblPersonaDto personaDto;
	
	private static final long serialVersionUID = -5290198995172316155L;

	public Integer getIdContactoPersona() {
		return idContactoPersona;
	}

	public void setIdContactoPersona(Integer idContactoPersona) {
		this.idContactoPersona = idContactoPersona;
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

	public tblPersonaDto getPersonaDto() {
		return personaDto;
	}

	public void setPersonaDto(tblPersonaDto personaDto) {
		this.personaDto = personaDto;
	}

	
	
	
}
