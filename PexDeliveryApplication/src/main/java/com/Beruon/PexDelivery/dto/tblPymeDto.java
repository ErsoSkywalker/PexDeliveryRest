package com.Beruon.PexDelivery.dto;

import java.io.Serializable;

import org.springframework.hateoas.ResourceSupport;


public class tblPymeDto extends ResourceSupport implements Serializable{

	public tblPymeDto() {
		
	}
	
	
	private static final long serialVersionUID = -5290198995172316155L;
	private Integer idPyme;
	private String nombrePyme;
	 private tblStatusDto statusDto;
	
	 public tblPymeDto(Integer idPyme){
		 this.idPyme = idPyme;
	 }
	 
	 public tblPymeDto(String nombrePyme) {
		 this.nombrePyme = nombrePyme;
	 }
	 
	 public tblPymeDto(Integer idPyme, String nombrePyme) {
			this.idPyme = idPyme;
			this.nombrePyme = nombrePyme;
		}
	 
	 public tblStatusDto getStatusDto() {
		return statusDto;
	}
	public void setStatusDto(tblStatusDto statusDto) {
		this.statusDto = statusDto;
	}
	public Integer getIdPyme() {
		return idPyme;
	}
	public void setIdPyme(Integer idPyme) {
		this.idPyme = idPyme;
	}
	public String getNombrePyme() {
		return nombrePyme;
	}
	public void setNombrePyme(String nombrePyme) {
		this.nombrePyme = nombrePyme;
	}
	
	
}
