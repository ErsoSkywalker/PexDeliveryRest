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
@Table(name = "tbldireccionespyme")
public class tblDireccionesPymeEntity implements Serializable {
	
	private static final long serialVersionUID = -5290198995172316155L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idDireccionesPyme;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "calle")
	private String calle;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "colonia")
	private String colonia;
	
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "delegacion")
	private String delegacion;
	
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "estado")
	private String estado;
	
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "pais")
	private String pais;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "codigopostal")
	private Integer codigoPostal;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "numeroexterior")
	private Integer numeroExterior;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "numerointerior")
	private Integer numeroInterior;
	
	@JoinColumn(name = "idstatus", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private tblStatusEntity statusEntity;

	@JoinColumn(name = "idpyme", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private tblPymeEntity pymeEntity;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calle == null) ? 0 : calle.hashCode());
		result = prime * result + ((codigoPostal == null) ? 0 : codigoPostal.hashCode());
		result = prime * result + ((colonia == null) ? 0 : colonia.hashCode());
		result = prime * result + ((delegacion == null) ? 0 : delegacion.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((idDireccionesPyme == null) ? 0 : idDireccionesPyme.hashCode());
		result = prime * result + ((numeroExterior == null) ? 0 : numeroExterior.hashCode());
		result = prime * result + ((numeroInterior == null) ? 0 : numeroInterior.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + ((pymeEntity == null) ? 0 : pymeEntity.hashCode());
		result = prime * result + ((statusEntity == null) ? 0 : statusEntity.hashCode());
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
		tblDireccionesPymeEntity other = (tblDireccionesPymeEntity) obj;
		if (calle == null) {
			if (other.calle != null)
				return false;
		} else if (!calle.equals(other.calle))
			return false;
		if (codigoPostal == null) {
			if (other.codigoPostal != null)
				return false;
		} else if (!codigoPostal.equals(other.codigoPostal))
			return false;
		if (colonia == null) {
			if (other.colonia != null)
				return false;
		} else if (!colonia.equals(other.colonia))
			return false;
		if (delegacion == null) {
			if (other.delegacion != null)
				return false;
		} else if (!delegacion.equals(other.delegacion))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (idDireccionesPyme == null) {
			if (other.idDireccionesPyme != null)
				return false;
		} else if (!idDireccionesPyme.equals(other.idDireccionesPyme))
			return false;
		if (numeroExterior == null) {
			if (other.numeroExterior != null)
				return false;
		} else if (!numeroExterior.equals(other.numeroExterior))
			return false;
		if (numeroInterior == null) {
			if (other.numeroInterior != null)
				return false;
		} else if (!numeroInterior.equals(other.numeroInterior))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (pymeEntity == null) {
			if (other.pymeEntity != null)
				return false;
		} else if (!pymeEntity.equals(other.pymeEntity))
			return false;
		if (statusEntity == null) {
			if (other.statusEntity != null)
				return false;
		} else if (!statusEntity.equals(other.statusEntity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "tblDireccionesPymeEntity [id=" + idDireccionesPyme + ", calle=" + calle + ", colonia=" + colonia + ", delegacion="
				+ delegacion + ", estado=" + estado + ", pais=" + pais + ", codigoPostal=" + codigoPostal
				+ ", numeroExterior=" + numeroExterior + ", numeroInterior=" + numeroInterior + ", statusEntity="
				+ statusEntity + ", pymeEntity=" + pymeEntity + "]";
	}

	public Integer getIdDireccionesPyme() {
		return idDireccionesPyme;
	}

	public void setIdDireccionesPyme(Integer idDireccionesPyme) {
		this.idDireccionesPyme = idDireccionesPyme;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getDelegacion() {
		return delegacion;
	}

	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Integer getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Integer getNumeroExterior() {
		return numeroExterior;
	}

	public void setNumeroExterior(Integer numeroExterior) {
		this.numeroExterior = numeroExterior;
	}

	public Integer getNumeroInterior() {
		return numeroInterior;
	}

	public void setNumeroInterior(Integer numeroInterior) {
		this.numeroInterior = numeroInterior;
	}

	public tblStatusEntity getStatusEntity() {
		return statusEntity;
	}

	public void setStatusEntity(tblStatusEntity statusEntity) {
		this.statusEntity = statusEntity;
	}

	public tblPymeEntity getPymeEntity() {
		return pymeEntity;
	}

	public void setPymeEntity(tblPymeEntity pymeEntity) {
		this.pymeEntity = pymeEntity;
	}

	
}
