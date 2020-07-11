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
@Table(name = "tblproductos")
public class tblProductosEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idProducto;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "nombre")
	private String nombre;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "descripcion")
	private String descripcion;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "costo")
	private Integer costo;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "cantidad")
	private Integer cantidad;

	@JoinColumn(name = "idstatus", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private tblStatusEntity statusEntity;

	@JoinColumn(name = "idpyme", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private tblPymeEntity pymeEntity;

	private static final long serialVersionUID = -5290198995172316155L;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + ((costo == null) ? 0 : costo.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((idProducto == null) ? 0 : idProducto.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		tblProductosEntity other = (tblProductosEntity) obj;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (costo == null) {
			if (other.costo != null)
				return false;
		} else if (!costo.equals(other.costo))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idProducto == null) {
			if (other.idProducto != null)
				return false;
		} else if (!idProducto.equals(other.idProducto))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
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

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
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

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
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

	@Override
	public String toString() {
		return "tblProductosEntity [idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", costo=" + costo + ", cantidad=" + cantidad + ", statusEntity=" + statusEntity + ", pymeEntity="
				+ pymeEntity + "]";
	}

	
	

}
