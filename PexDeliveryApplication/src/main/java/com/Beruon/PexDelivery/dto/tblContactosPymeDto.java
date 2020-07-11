package com.Beruon.PexDelivery.dto;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.ResourceSupport;


public class tblContactosPymeDto extends ResourceSupport implements Serializable{

	private Integer idContactoPyme;
	private String contacto;
	private tblStatusDto statusDto;
	private tblTipoContactoDto tipoContactoDto;
	private tblPymeDto pymeDto;
	
	private static final long serialVersionUID = -5290198995172316155L;

	public Integer getIdContacto() {
		return idContactoPyme;
	}
	
	public void setId(Integer idContactoPyme) {
		this.idContactoPyme = idContactoPyme;
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

	public tblPymeDto getPymeDto() {
		return pymeDto;
	}

	public void setPymeDto(tblPymeDto pymeDto) {
		this.pymeDto = pymeDto;
	}
	
	
	
}
