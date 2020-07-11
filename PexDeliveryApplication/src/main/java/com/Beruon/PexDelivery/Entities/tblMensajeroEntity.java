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
@Table(name = "tblmensajero")
public class tblMensajeroEntity implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idmensajero")
	private Integer idMensajero;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "nombre")
	private String nombre;
	
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "apellidop")
	private String apellidoP;
	
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "apellidom")
	private String apellidoM;
	
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "usuario")
	private String usuario;
	
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "contrasena")
	private String contrasena;
	
	@JoinColumn(name = "idtamano", referencedColumnName = "idtamano")
	@ManyToOne(optional = false)
	private tblTamanoEntity tamanoEntity;
	
	private static final long serialVersionUID = -5290198995172316155L;

	
	
	
	
	public Integer getIdMensajero() {
		return idMensajero;
	}

	public void setIdMensajero(Integer idMensajero) {
		this.idMensajero = idMensajero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public tblTamanoEntity getTamanoEntity() {
		return tamanoEntity;
	}

	public void setTamanoEntity(tblTamanoEntity tamanoEntity) {
		this.tamanoEntity = tamanoEntity;
	}

	@Override
	   public String toString() {
	       return "Mensajero [idMensajero=" + idMensajero + ", Nombre=" + nombre + ", ApellidoPaterno="+apellidoP+",ApellidoMaterno="+apellidoM+",Tamaño="+tamanoEntity+",Usuario="+usuario+",Contraseña="+contrasena+"]";
	   }

	   @Override
	   public int hashCode() {
	       final int prime = 31;
	       int result = 1;
	       result = prime * result + ((idMensajero == null) ? 0 : idMensajero.hashCode());
	       result = prime * result + ((tamanoEntity == null) ? 0 : tamanoEntity.hashCode());
	       result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
	       result = prime * result + ((apellidoP == null) ? 0 : apellidoP.hashCode());
	       result = prime * result + ((apellidoM == null) ? 0 : apellidoM.hashCode());
	       result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
	       result = prime * result + ((contrasena == null) ? 0 : contrasena.hashCode());
	       
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
	       tblMensajeroEntity other = (tblMensajeroEntity) obj;
	       if (idMensajero == null) {
	           if (other.idMensajero != null)
	               return false;
	       } else if (!idMensajero.equals(other.idMensajero))
	           return false;
	       if (nombre == null) {
	           if (other.nombre != null)
	               return false;
	       } else if (!nombre.equals(other.nombre))
	           return false;
	       
	       if (apellidoP == null) {
	           if (other.apellidoP != null)
	               return false;
	       } else if (!apellidoP.equals(other.apellidoP))
	           return false;
	       
	       if (apellidoM == null) {
	           if (other.apellidoM != null)
	               return false;
	       } else if (!apellidoM.equals(other.apellidoM))
	           return false;
	       
	       if (usuario == null) {
	           if (other.usuario != null)
	               return false;
	       } else if (!usuario.equals(other.usuario))
	           return false;
	       
	       if (contrasena == null) {
	           if (other.contrasena != null)
	               return false;
	       } else if (!contrasena.equals(other.contrasena))
	           return false;
	       
	       if (tamanoEntity == null) {
	           if (other.tamanoEntity != null)
	               return false;
	       } else if (!tamanoEntity.equals(other.tamanoEntity))
	           return false;
	       return true;
	   }
	
}
