package com.Beruon.PexDelivery.Entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
/**
 * @author Christian Ontiveros
 *
 */
@Entity
@Table(name = "tblcontactospyme")
public class tblContactosPymeEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idContactoPyme;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "contacto")
	private String contacto;

	@JoinColumn(name = "idstatus", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private tblStatusEntity statusEntity;

	@JoinColumn(name = "idtipocontacto", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private tblTipoContactoEntity tipoContactoEntity;

	@JoinColumn(name = "idpyme", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private tblPymeEntity pymeEntity;

	public Integer getIdContactoPyme() {
		return idContactoPyme;
	}

	public void setIdContactoPyme(Integer idContactoPyme) {
		this.idContactoPyme = idContactoPyme;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public tblStatusEntity getStatusEntity() {
		return statusEntity;
	}

	public void setStatusEntity(tblStatusEntity statusEntity) {
		this.statusEntity = statusEntity;
	}

	public tblTipoContactoEntity getTipoContactoEntity() {
		return tipoContactoEntity;
	}

	public void setTipoContactoEntity(tblTipoContactoEntity tipoContactoEntity) {
		this.tipoContactoEntity = tipoContactoEntity;
	}

	public tblPymeEntity getPymeEntity() {
		return pymeEntity;
	}

	public void setPymeEntity(tblPymeEntity pymeEntity) {
		this.pymeEntity = pymeEntity;
	}

	private static final long serialVersionUID = -5290198995172316155L;

	@Override
	public String toString() {
		return "ContactoPyme [idContactoPyme=" + idContactoPyme + ", Contacto=" + contacto + ", Status=" + statusEntity + ", Pyme="
				+ pymeEntity + ", TipoContacto=" + tipoContactoEntity + " ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idContactoPyme == null) ? 0 : idContactoPyme.hashCode());
		result = prime * result + ((contacto == null) ? 0 : contacto.hashCode());
		result = prime * result + ((statusEntity == null) ? 0 : statusEntity.hashCode());
		result = prime * result + ((pymeEntity == null) ? 0 : pymeEntity.hashCode());
		result = prime * result + ((tipoContactoEntity == null) ? 0 : tipoContactoEntity.hashCode());
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

		tblContactosPymeEntity other = (tblContactosPymeEntity) obj;

		if (idContactoPyme == null) {
			if (other.idContactoPyme != null)
				return false;
		} else if (!idContactoPyme.equals(other.idContactoPyme))
			return false;

		if (contacto == null) {
			if (other.contacto != null)
				return false;
		} else if (!contacto.equals(other.contacto))
			return false;

		if (statusEntity == null) {
			if (other.statusEntity != null)
				return false;
		} else if (!statusEntity.equals(other.statusEntity))
			return false;

		if (tipoContactoEntity == null) {
			if (other.tipoContactoEntity != null)
				return false;
		} else if (!tipoContactoEntity.equals(other.tipoContactoEntity))
			return false;

		if (pymeEntity == null) {
			if (other.pymeEntity != null)
				return false;
		} else if (!pymeEntity.equals(other.pymeEntity))
			return false;

		return true;
	}

}
