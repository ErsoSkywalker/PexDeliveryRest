package com.Beruon.PexDelivery.dto;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.ResourceSupport;

public class tblDireccionesPersonaDto extends ResourceSupport implements Serializable{

	private static final long serialVersionUID = -5290198995172316155L;
	
	private Integer idDireccionPersona;
	private String calle, colonia, delegacion, estado, pais;
	private int codigoPostal, numeroExterior, numeroInterior;
	private tblStatusDto statusDto;
	private tblPersonaDto personaDto;
	
	public Integer getIdDireccionPersona() {
		return idDireccionPersona;
	}
	public void setIdDireccionPersona(Integer idDireccionPersona) {
		this.idDireccionPersona = idDireccionPersona;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getDelegacion() {
		return delegacion;
	}
	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public int getNumeroExterior() {
		return numeroExterior;
	}
	public void setNumeroExterior(int numeroExterior) {
		this.numeroExterior = numeroExterior;
	}
	public int getNumeroInterior() {
		return numeroInterior;
	}
	public void setNumeroInterior(int numeroInterior) {
		this.numeroInterior = numeroInterior;
	}
	public tblStatusDto getStatusDto() {
		return statusDto;
	}
	public void setStatusDto(tblStatusDto statusDto) {
		this.statusDto = statusDto;
	}
	public tblPersonaDto getPersonaDto() {
		return personaDto;
	}
	public void setPersonaDto(tblPersonaDto personaDto) {
		this.personaDto = personaDto;
	}
	
	
	
}
