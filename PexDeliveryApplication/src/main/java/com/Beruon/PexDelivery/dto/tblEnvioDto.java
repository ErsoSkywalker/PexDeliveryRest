package com.Beruon.PexDelivery.dto;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.ResourceSupport;

public class tblEnvioDto extends ResourceSupport implements Serializable{

	private static final long serialVersionUID = -5290198995172316155L;
	
	private Integer idEnvio;
	private String instrucciones, codigoSeguimiento, codigoRecepcion, codigoEnvio;
	private tblPymeDto pymeDto;
	private tblPersonaDto personaDto;
	private tblDireccionEnvioDto direccionEnvioDto;
	private tblProductosDto productoDto;
	private tblStatusDto statusDto;
	private tblTamanoDto tamanoDto;
	private tblMensajeroDto mensajeroDto;
	public Integer getIdEnvio() {
		return idEnvio;
	}
	public void setIdEnvio(Integer idEnvio) {
		this.idEnvio = idEnvio;
	}
	public String getInstrucciones() {
		return instrucciones;
	}
	public void setInstrucciones(String instrucciones) {
		this.instrucciones = instrucciones;
	}
	public String getCodigoSeguimiento() {
		return codigoSeguimiento;
	}
	public void setCodigoSeguimiento(String codigoSeguimiento) {
		this.codigoSeguimiento = codigoSeguimiento;
	}
	public String getCodigoRecepcion() {
		return codigoRecepcion;
	}
	public void setCodigoRecepcion(String codigoRecepcion) {
		this.codigoRecepcion = codigoRecepcion;
	}
	public String getCodigoEnvio() {
		return codigoEnvio;
	}
	public void setCodigoEnvio(String codigoEnvio) {
		this.codigoEnvio = codigoEnvio;
	}
	public tblPymeDto getPymeDto() {
		return pymeDto;
	}
	public void setPymeDto(tblPymeDto pymeDto) {
		this.pymeDto = pymeDto;
	}
	public tblPersonaDto getPersonaDto() {
		return personaDto;
	}
	public void setPersonaDto(tblPersonaDto personaDto) {
		this.personaDto = personaDto;
	}
	public tblDireccionEnvioDto getDireccionEnvioDto() {
		return direccionEnvioDto;
	}
	public void setDireccionEnvioDto(tblDireccionEnvioDto direccionEnvioDto) {
		this.direccionEnvioDto = direccionEnvioDto;
	}
	public tblProductosDto getProductoDto() {
		return productoDto;
	}
	public void setProductoDto(tblProductosDto productoDto) {
		this.productoDto = productoDto;
	}
	public tblStatusDto getStatusDto() {
		return statusDto;
	}
	public void setStatusDto(tblStatusDto statusDto) {
		this.statusDto = statusDto;
	}
	public tblTamanoDto getTamanoDto() {
		return tamanoDto;
	}
	public void setTamanoDto(tblTamanoDto tamanoDto) {
		this.tamanoDto = tamanoDto;
	}
	public tblMensajeroDto getMensajeroDto() {
		return mensajeroDto;
	}
	public void setMensajeroDto(tblMensajeroDto mensajeroDto) {
		this.mensajeroDto = mensajeroDto;
	}
	
	
	
	
}
