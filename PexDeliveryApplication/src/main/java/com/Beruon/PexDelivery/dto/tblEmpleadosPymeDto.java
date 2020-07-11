package com.Beruon.PexDelivery.dto;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.ResourceSupport;

public class tblEmpleadosPymeDto extends ResourceSupport implements Serializable{

	private Integer idEmpleadosPyme;
	private String nombre,apellidoP,apellidoM,cargo;
	private tblStatusDto statusDto;
	private tblPymeDto pymeDto;

	private static final long serialVersionUID = -5290198995172316155L;

	public Integer getIdEmpleadosPyme() {
		return idEmpleadosPyme;
	}

	public void setIdEmpleadosPyme(Integer idEmpleadosPyme) {
		this.idEmpleadosPyme = idEmpleadosPyme;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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
