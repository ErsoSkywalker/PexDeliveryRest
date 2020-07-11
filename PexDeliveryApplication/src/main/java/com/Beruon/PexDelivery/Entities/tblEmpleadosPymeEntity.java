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
@Table(name = "tblempleadospyme")
public class tblEmpleadosPymeEntity implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer idEmpleadosPyme;

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
   @Column(name = "cargo")
   private String cargo;
   
   @JoinColumn(name = "idstatus", referencedColumnName = "id")
   @ManyToOne(optional = false)
   private tblStatusEntity statusEntity;
   
   @JoinColumn(name = "idpyme", referencedColumnName = "id")
   @ManyToOne(optional = false)
   private tblPymeEntity pymeEntity;


   

private static final long serialVersionUID = -5290198995172316155L;

  


   

   

   public Integer getIdEmpleadosPyme() {
	return idEmpleadosPyme;
}

public void setIdEmpleadosPyme(Integer idEmpleadosPyme) {
	this.idEmpleadosPyme = idEmpleadosPyme;
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

public String getCargo() {
	return cargo;
}

public void setCargo(String cargo) {
	this.cargo = cargo;
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
       return "EmpleadosPyme [idEmpleadosPyme=" + idEmpleadosPyme + ", Nombre=" + nombre + ", ApellidoPaterno="+apellidoP+", ApellidoMaterno="+apellidoM+", Cargo="+cargo+", Status=" + statusEntity + ", Pyme="+pymeEntity+"]";
   }

   @Override
   public int hashCode() {
       final int prime = 31;
       int result = 1;
       result = prime * result + ((idEmpleadosPyme == null) ? 0 : idEmpleadosPyme.hashCode());
       result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
       result = prime * result + ((apellidoP == null) ? 0 : apellidoP.hashCode());
       result = prime * result + ((apellidoM== null) ? 0 : apellidoM.hashCode());
       result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
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
       tblEmpleadosPymeEntity other = (tblEmpleadosPymeEntity) obj;
       if (idEmpleadosPyme == null) {
           if (other.idEmpleadosPyme != null)
               return false;
       } else if (!idEmpleadosPyme.equals(other.idEmpleadosPyme))
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
       
       if (cargo == null) {
           if (other.cargo != null)
               return false;
       } else if (!cargo.equals(other.cargo))
           return false;
       
       if (statusEntity == null) {
           if (other.statusEntity != null)
               return false;
       } else if (!statusEntity.equals(other.statusEntity))
           return false;
       
       if (pymeEntity == null) {
           if (other.pymeEntity != null)
               return false;
       } else if (!pymeEntity.equals(other.pymeEntity))
           return false;
       
       return true;
   }

}
