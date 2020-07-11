package com.Beruon.PexDelivery.dto;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.ResourceSupport;

public class tblDireccionEnvioDto extends ResourceSupport implements Serializable{

	private static final long serialVersionUID = -5290198995172316155L;
	
	private Integer idDireccionEnvio;
	private String calle;
	private String colonia;
	private String delegacion;
	private String estado;
	private String pais;
	private Integer numeroExterior;
	private Integer numeroInterior;
	private tblCodigosPostalesDto codigosPostales;
	public Integer getIdDireccionEnvio() {
		return idDireccionEnvio;
	}
	public void setIdDireccionEnvio(Integer idDireccionEnvio) {
		this.idDireccionEnvio = idDireccionEnvio;
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
	public Integer getNumeroExterior() {
		return numeroExterior;
	}
	public void setNumeroExterior(Integer numeroExterior) {
		this.numeroExterior = numeroExterior;
	}
	public Integer getNumeroInterior() {
		return numeroInterior;
	}
	public void setNumeroInterior(Integer numeroInterior) {
		this.numeroInterior = numeroInterior;
	}
	public tblCodigosPostalesDto getCodigosPostales() {
		return codigosPostales;
	}
	public void setCodigosPostales(tblCodigosPostalesDto codigosPostales) {
		this.codigosPostales = codigosPostales;
	}
	
	
	
	
}
