package com.Beruon.PexDelivery.dto;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.ResourceSupport;

public class tblMensajeroDto extends ResourceSupport implements Serializable{
	
	private static final long serialVersionUID = -5290198995172316155L;
	
	public tblMensajeroDto() {
		
	}
	
	public tblMensajeroDto(String usuario, String contrasena) {
		this.usuario = usuario;
		this.contrasena = contrasena;
	}
	
	private Integer idMensajero;
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private String usuario;
	private String contrasena;
	private tblTamanoDto tamanoDto;
	public Integer getIdMensajero() {
		return idMensajero;
	}
	public void setIdMensajero(Integer idMensajero) {
		this.idMensajero = idMensajero;
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
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public tblTamanoDto getTamanoDto() {
		return tamanoDto;
	}
	public void setTamanoDto(tblTamanoDto tamanoDto) {
		this.tamanoDto = tamanoDto;
	}
	
	
	
	
}
