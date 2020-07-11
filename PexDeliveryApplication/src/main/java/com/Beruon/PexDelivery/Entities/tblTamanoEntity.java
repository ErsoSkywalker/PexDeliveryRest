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

@Entity
@Table(name = "tbltamano")
public class tblTamanoEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtamano")
	private Integer idTamano;
		
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "tamano")
	private String tamano;
	   
	private static final long serialVersionUID = -5290198995172316155L;

	public Integer getIdTamano() {
		return idTamano;
	}

	public void setIdTamano(Integer idTamano) {
		this.idTamano = idTamano;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTamano == null) ? 0 : idTamano.hashCode());
		result = prime * result + ((tamano == null) ? 0 : tamano.hashCode());
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
		tblTamanoEntity other = (tblTamanoEntity) obj;
		if (idTamano == null) {
			if (other.idTamano != null)
				return false;
		} else if (!idTamano.equals(other.idTamano))
			return false;
		if (tamano == null) {
			if (other.tamano != null)
				return false;
		} else if (!tamano.equals(other.tamano))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "tblTamanoEntity [idTamano=" + idTamano + ", tamano=" + tamano + "]";
	}
	
	
	
}
