/**
 * 
 */
package com.Beruon.PexDelivery.dto;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.ResourceSupport;

/**
 * @author conti
 *
 */
public class tblStatusDto extends ResourceSupport implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5290198995172316155L;
	private Integer idStatus;
	private String estatus;
	
	
	public Integer getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public tblStatusDto() {
		
	}
	
	public tblStatusDto(String estatus) {
		this.estatus = estatus;
	}
	
	
}
