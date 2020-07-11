package com.Beruon.PexDelivery.Entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
@Entity
@Table(name = "tblcodigospostales")
public class tblCodigosPostalesEntity  implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idCodigoPostal;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "codigopostal")
	private String codigoPostal;
	
	private static final long serialVersionUID = -5290198995172316155L;

	public Integer getIdCodigoPostal() {
		return idCodigoPostal;
	}

	public void setIdCodigoPostal(Integer idCodigoPostal) {
		this.idCodigoPostal = idCodigoPostal;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	@Override
	public String toString() {
		return "CodigosPostales [idCodigoPostal=" + idCodigoPostal + ", CodigoPostal=" + codigoPostal + " ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCodigoPostal == null) ? 0 : idCodigoPostal.hashCode());
		result = prime * result + ((codigoPostal == null) ? 0 : codigoPostal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		tblCodigosPostalesEntity other = (tblCodigosPostalesEntity) obj;

		if (idCodigoPostal == null) {
			if (other.idCodigoPostal != null)
				return false;
		} else if (!idCodigoPostal.equals(other.idCodigoPostal))
			return false;

		if (codigoPostal == null) {
			if (other.codigoPostal != null)
				return false;
		} else if (!codigoPostal.equals(other.codigoPostal))
			return false;


		return true;
	}
	
}
