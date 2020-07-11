/**
 * 
 */
package com.Beruon.PexDelivery.Entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author Christian Ontiveros
 *
 */
@Entity
@Table(name = "tbltipocontacto")
public class tblTipoContactoEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idTipoContacto;

	@Column(name = "tipocontacto")
	private String tipoContacto;

	private static final long serialVersionUID = -5290198995172316155L;

	public Integer getIdTipoContacto() {
		return idTipoContacto;
	}

	public void setIdTipoContacto(Integer idTipoContacto) {
		this.idTipoContacto = idTipoContacto;
	}

	public String getTipoContacto() {
		return tipoContacto;
	}

	public void setTipoContacto(String tipoContacto) {
		this.tipoContacto = tipoContacto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTipoContacto == null) ? 0 : idTipoContacto.hashCode());
		result = prime * result + ((tipoContacto == null) ? 0 : tipoContacto.hashCode());
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
		tblTipoContactoEntity other = (tblTipoContactoEntity) obj;
		if (idTipoContacto == null) {
			if (other.idTipoContacto != null)
				return false;
		} else if (!idTipoContacto.equals(other.idTipoContacto))
			return false;
		if (tipoContacto == null) {
			if (other.tipoContacto != null)
				return false;
		} else if (!tipoContacto.equals(other.tipoContacto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "tblTipoContactoEntity [idTipoContacto=" + idTipoContacto + ", tipoContacto=" + tipoContacto + "]";
	}

	
	

}
