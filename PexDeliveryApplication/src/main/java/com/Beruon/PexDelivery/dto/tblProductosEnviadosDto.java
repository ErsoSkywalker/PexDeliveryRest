package com.Beruon.PexDelivery.dto;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.ResourceSupport;

public class tblProductosEnviadosDto extends ResourceSupport implements Serializable{

	private Integer idProductoEnviado;
	private String nombre;
	private String descripcion;
	private Integer costo;

	private static final long serialVersionUID = -5290198995172316155L;

	public Integer getIdProductoEnviado() {
		return idProductoEnviado;
	}

	public void setIdProductoEnviado(Integer idProductoEnviado) {
		this.idProductoEnviado = idProductoEnviado;
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
	
	
	
}
