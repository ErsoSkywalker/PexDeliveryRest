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
@Table(name = "tblenvio")
public class tblEnvioEntity implements Serializable {

	private static final long serialVersionUID = -5290198995172316155L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idEnvio;

	@JoinColumn(name = "idpyme", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private tblPymeEntity pymeEntity;

	@JoinColumn(name = "idpersona", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private tblPersonaEntity personaEntity;

	@JoinColumn(name = "iddireccionenvio", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private tblDireccionEnvioEntity direccionEnvioEntity;

	@JoinColumn(name = "idproducto", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private tblProductosEntity productoEntity;

	@JoinColumn(name = "idstatus", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private tblStatusEntity statusEntity;

	@JoinColumn(name = "idtamano", referencedColumnName = "idtamano")
	@ManyToOne(optional = false)
	private tblTamanoEntity tamanoEntity;

	@JoinColumn(name = "idmensajero", referencedColumnName = "idmensajero")
	@ManyToOne(optional = false)
	private tblMensajeroEntity mensajeroEntity;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 200)
	@Column(name = "instrucciones")
	private String instrucciones;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 200)
	@Column(name = "codigoseguimiento")
	private String codigoSeguimiento;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 200)
	@Column(name = "codigoenvio")
	private String codigoEnvio;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 200)
	@Column(name = "codigorecepcion")
	private String codigoRecepcion;

	

	public Integer getIdEnvio() {
		return idEnvio;
	}

	public void setIdEnvio(Integer idEnvio) {
		this.idEnvio = idEnvio;
	}

	public tblPymeEntity getPymeEntity() {
		return pymeEntity;
	}

	public void setPymeEntity(tblPymeEntity pymeEntity) {
		this.pymeEntity = pymeEntity;
	}

	public tblPersonaEntity getPersonaEntity() {
		return personaEntity;
	}

	public void setPersonaEntity(tblPersonaEntity personaEntity) {
		this.personaEntity = personaEntity;
	}

	public tblDireccionEnvioEntity getDireccionEnvioEntity() {
		return direccionEnvioEntity;
	}

	public void setDireccionEnvioEntity(tblDireccionEnvioEntity direccionEnvioEntity) {
		this.direccionEnvioEntity = direccionEnvioEntity;
	}

	public tblProductosEntity getProductoEntity() {
		return productoEntity;
	}

	public void setProductoEntity(tblProductosEntity productoEntity) {
		this.productoEntity = productoEntity;
	}

	public tblStatusEntity getStatusEntity() {
		return statusEntity;
	}

	public void setStatusEntity(tblStatusEntity statusEntity) {
		this.statusEntity = statusEntity;
	}

	public tblTamanoEntity getTamanoEntity() {
		return tamanoEntity;
	}

	public void setTamanoEntity(tblTamanoEntity tamanoEntity) {
		this.tamanoEntity = tamanoEntity;
	}

	public tblMensajeroEntity getMensajeroEntity() {
		return mensajeroEntity;
	}

	public void setMensajeroEntity(tblMensajeroEntity mensajeroEntity) {
		this.mensajeroEntity = mensajeroEntity;
	}

	public String getInstrucciones() {
		return instrucciones;
	}

	public void setInstrucciones(String instrucciones) {
		this.instrucciones = instrucciones;
	}

	public String getCodigoSeguimiento() {
		return codigoSeguimiento;
	}

	public void setCodigoSeguimiento(String codigoSeguimiento) {
		this.codigoSeguimiento = codigoSeguimiento;
	}

	public String getCodigoEnvio() {
		return codigoEnvio;
	}

	public void setCodigoEnvio(String codigoEnvio) {
		this.codigoEnvio = codigoEnvio;
	}

	public String getCodigoRecepcion() {
		return codigoRecepcion;
	}

	public void setCodigoRecepcion(String codigoRecepcion) {
		this.codigoRecepcion = codigoRecepcion;
	}

	@Override
	public String toString() {
		return "Envio [idEnvio=" + idEnvio + ", Instrucciones=" + instrucciones + ", CodigoSeguimiento= "
				+ codigoSeguimiento + ", CodigoEnvio=" + codigoEnvio + ", CodigoRecepcion=" + codigoRecepcion + 
				"Pyme="+pymeEntity+", Persona="+personaEntity+", DireccionEnvio="+direccionEnvioEntity+
				"Producto="+productoEntity+", Estatus="+statusEntity+", Tamano="+tamanoEntity+", Mensajero="+mensajeroEntity+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEnvio == null) ? 0 : idEnvio.hashCode());
		result = prime * result + ((instrucciones == null) ? 0 : instrucciones.hashCode());
		result = prime * result + ((codigoEnvio == null) ? 0 : codigoEnvio.hashCode());
		result = prime * result + ((codigoRecepcion == null) ? 0 : codigoRecepcion.hashCode());
		result = prime * result + ((codigoSeguimiento == null) ? 0 : codigoSeguimiento.hashCode());
		result = prime * result + ((pymeEntity == null) ? 0 : pymeEntity.hashCode());
		result = prime * result + ((personaEntity == null) ? 0 : personaEntity.hashCode());
		result = prime * result + ((direccionEnvioEntity == null) ? 0 : direccionEnvioEntity.hashCode());
		result = prime * result + ((productoEntity == null) ? 0 : productoEntity.hashCode());
		result = prime * result + ((statusEntity == null) ? 0 : statusEntity.hashCode());
		result = prime * result + ((tamanoEntity == null) ? 0 : tamanoEntity.hashCode());
		result = prime * result + ((mensajeroEntity == null) ? 0 : mensajeroEntity.hashCode());
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

		tblEnvioEntity other = (tblEnvioEntity) obj;

		if (idEnvio == null) {
			if (other.idEnvio != null)
				return false;
		} else if (!idEnvio.equals(other.idEnvio))
			return false;

		if (instrucciones == null) {
			if (other.instrucciones != null)
				return false;
		} else if (!instrucciones.equals(other.instrucciones))
			return false;
		
		if (codigoEnvio == null) {
			if (other.codigoEnvio != null)
				return false;
		} else if (!codigoEnvio.equals(other.codigoEnvio))
			return false;
		
		if (codigoRecepcion == null) {
			if (other.codigoRecepcion != null)
				return false;
		} else if (!codigoRecepcion.equals(other.codigoRecepcion))
			return false;
		
		if (codigoSeguimiento == null) {
			if (other.codigoSeguimiento != null)
				return false;
		} else if (!codigoSeguimiento.equals(other.codigoSeguimiento))
			return false;
		
		if (pymeEntity == null) {
			if (other.pymeEntity != null)
				return false;
		} else if (!pymeEntity.equals(other.pymeEntity))
			return false;
		
		if (personaEntity == null) {
			if (other.personaEntity != null)
				return false;
		} else if (!personaEntity.equals(other.personaEntity))
			return false;
		
		if (direccionEnvioEntity == null) {
			if (other.direccionEnvioEntity != null)
				return false;
		} else if (!direccionEnvioEntity.equals(other.direccionEnvioEntity))
			return false;
		
		if (productoEntity == null) {
			if (other.productoEntity != null)
				return false;
		} else if (!productoEntity.equals(other.productoEntity))
			return false;
		
		if (statusEntity == null) {
			if (other.statusEntity != null)
				return false;
		} else if (!statusEntity.equals(other.statusEntity))
			return false;
		
		if (tamanoEntity == null) {
			if (other.tamanoEntity != null)
				return false;
		} else if (!tamanoEntity.equals(other.tamanoEntity))
			return false;
		
		if (mensajeroEntity == null) {
			if (other.mensajeroEntity != null)
				return false;
		} else if (!mensajeroEntity.equals(other.mensajeroEntity))
			return false;

		return true;
	}

}
