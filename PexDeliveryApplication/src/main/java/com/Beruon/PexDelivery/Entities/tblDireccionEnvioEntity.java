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
@Table(name = "tbldireccionenvio")
public class tblDireccionEnvioEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idDireccionEnvio;

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
	@Size(min = 1, max = 45)
	@Column(name = "numeroexterior")
	private Integer numeroExterior;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "numerointerior")
	private Integer numeroInterior;

	@JoinColumn(name = "idcodigopostal", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private tblCodigosPostalesEntity codigosPostalesEntity;

	private static final long serialVersionUID = -5290198995172316155L;

	public Integer getIdDireccionEnvio() {
		return idDireccionEnvio;
	}

	public void setIdProducto(Integer idDireccionEnvio) {
		this.idDireccionEnvio = idDireccionEnvio;
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

	public tblCodigosPostalesEntity getCodigosPostalesEntity() {
		return codigosPostalesEntity;
	}

	public void setCodigosPostalesEntity(tblCodigosPostalesEntity codigosPostalesEntity) {
		this.codigosPostalesEntity = codigosPostalesEntity;
	}

	@Override
	public String toString() {
		return "DireccionEnvio [idDireccionEnvio=" + idDireccionEnvio + ", Calle=" + calle + ", Colonia=" + colonia
				+ ", Delegacion=" + delegacion + ",Estado=" + estado + ", Pais=" + pais + ",CodigoPostal="
				+ codigosPostalesEntity + ",NumeroExterior=" + numeroExterior + ",NumeroInterior=" + numeroInterior
				+ " ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idDireccionEnvio == null) ? 0 : idDireccionEnvio.hashCode());
		result = prime * result + ((calle == null) ? 0 : calle.hashCode());
		result = prime * result + ((colonia == null) ? 0 : colonia.hashCode());
		result = prime * result + ((delegacion == null) ? 0 : delegacion.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + ((numeroExterior == null) ? 0 : numeroExterior.hashCode());
		result = prime * result + ((numeroInterior == null) ? 0 : numeroInterior.hashCode());
		result = prime * result + ((codigosPostalesEntity == null) ? 0 : codigosPostalesEntity.hashCode());
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

		tblDireccionEnvioEntity other = (tblDireccionEnvioEntity) obj;

		if (idDireccionEnvio == null) {
			if (other.idDireccionEnvio != null)
				return false;
		} else if (!idDireccionEnvio.equals(other.idDireccionEnvio))
			return false;

		if (calle == null) {
			if (other.calle != null)
				return false;
		} else if (!calle.equals(other.calle))
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

		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
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

		if (codigosPostalesEntity == null) {
			if (other.codigosPostalesEntity != null)
				return false;
		} else if (!codigosPostalesEntity.equals(other.codigosPostalesEntity))
			return false;

		return true;
	}

}
