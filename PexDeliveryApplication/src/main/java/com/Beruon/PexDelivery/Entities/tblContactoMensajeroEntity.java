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


@Entity
@Table(name = "tblcontactomensajero")
public class tblContactoMensajeroEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcontactomensajero")
	private Integer idContactoMensajero;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "contactomensajero")
	private String contacto;

	@JoinColumn(name = "idstatus", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private tblStatusEntity statusEntity;

	@JoinColumn(name = "idtipocontacto", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private tblTipoContactoEntity tipoContactoEntity;

	@JoinColumn(name = "idmensajero", referencedColumnName = "idmensajero")
	@ManyToOne(optional = false)
	private tblMensajeroEntity mensajeroEntity;


	private static final long serialVersionUID = -5290198995172316155L;


	public Integer getIdContactoMensajero() {
		return idContactoMensajero;
	}


	public void setIdContactoMensajero(Integer idContactoMensajero) {
		this.idContactoMensajero = idContactoMensajero;
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


	public tblMensajeroEntity getMensajeroEntity() {
		return mensajeroEntity;
	}


	public void setMensajeroEntity(tblMensajeroEntity mensajeroEntity) {
		this.mensajeroEntity = mensajeroEntity;
	}

	@Override
	public String toString() {
		return "ContactoMensajero [idContactoMensajero=" + idContactoMensajero + ", Contacto=" + contacto + ", Status=" + statusEntity + ", Mensajero="
				+ mensajeroEntity + ", TipoContacto=" + tipoContactoEntity + " ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idContactoMensajero == null) ? 0 : idContactoMensajero.hashCode());
		result = prime * result + ((contacto == null) ? 0 : contacto.hashCode());
		result = prime * result + ((statusEntity == null) ? 0 : statusEntity.hashCode());
		result = prime * result + ((mensajeroEntity == null) ? 0 : mensajeroEntity.hashCode());
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

		tblContactoMensajeroEntity other = (tblContactoMensajeroEntity) obj;

		if (idContactoMensajero == null) {
			if (other.idContactoMensajero != null)
				return false;
		} else if (!idContactoMensajero.equals(other.idContactoMensajero))
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

		if (mensajeroEntity == null) {
			if (other.mensajeroEntity != null)
				return false;
		} else if (!mensajeroEntity.equals(other.mensajeroEntity))
			return false;

		return true;
	}

	
	
}
