package com.Beruon.PexDelivery.dto;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.ResourceSupport;

import com.Beruon.PexDelivery.Services.tblDireccionesPymeServices;

public class tblDireccionesPymeDto  extends ResourceSupport implements Serializable{

	
	private Integer idDireccionesPyme;
	private String calle, colonia, delegacion, estado, pais;
	private int codigoPostal, numeroExterior, numeroInterior;
	private tblStatusDto statusDto;
	private tblPymeDto pymeDto;
	public Integer getIdDireccionesPyme() {
		return idDireccionesPyme;
	}

	public void setIdDireccionesPyme(Integer idDireccionesPyme) {
		this.idDireccionesPyme = idDireccionesPyme;
	}

	

	private static final long serialVersionUID = -5290198995172316155L;

	public tblDireccionesPymeDto() {
		
	}
	
	public tblDireccionesPymeDto(Integer idDireccionesPyme) {
		this.idDireccionesPyme = idDireccionesPyme;
	}
	
	public tblDireccionesPymeDto(String calle, String colonia, String delegacion, String estado, String pais,
			int codigoPostal, int numeroExterior, int numeroInterior) {
		
		this.calle = calle;
		this.colonia = colonia;
		this.delegacion = delegacion;
		this.estado = estado;
		this.pais = pais;
		this.codigoPostal = codigoPostal;
		this.numeroExterior = numeroExterior;
		this.numeroInterior = numeroInterior;
	}
	
	public tblDireccionesPymeDto(Integer idDireccionesPyme, String calle, String colonia, String delegacion, String estado, String pais,
			int codigoPostal, int numeroExterior, int numeroInterior) {
		this.idDireccionesPyme = idDireccionesPyme;
		this.calle = calle;
		this.colonia = colonia;
		this.delegacion = delegacion;
		this.estado = estado;
		this.pais = pais;
		this.codigoPostal = codigoPostal;
		this.numeroExterior = numeroExterior;
		this.numeroInterior = numeroInterior;
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

	public tblPymeDto getPymeDto() {
		return pymeDto;
	}

	public void setPymeDto(tblPymeDto pymeDto) {
		this.pymeDto = pymeDto;
	}
	
	
	
}
