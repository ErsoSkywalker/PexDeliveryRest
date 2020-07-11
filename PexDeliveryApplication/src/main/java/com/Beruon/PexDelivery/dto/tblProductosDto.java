package com.Beruon.PexDelivery.dto;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.ResourceSupport;

public class tblProductosDto extends ResourceSupport implements Serializable{

	private Integer idProducto;
	private String nombre;
	private String descripcion;
	private Integer costo;
	private Integer cantidad;
	private tblStatusDto statusDto;
	private tblPymeDto pymeDto;
	
	private static final long serialVersionUID = -5290198995172316155L;

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getCosto() {
		return costo;
	}

	public void setCosto(Integer costo) {
		this.costo = costo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
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
