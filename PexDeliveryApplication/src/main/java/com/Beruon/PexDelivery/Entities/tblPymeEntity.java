/**
 * 
 */
package com.Beruon.PexDelivery.Entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.annotations.Parameter;

/**
* @author Christian Ontiveros
*
*/
@Entity
@Table(name = "tblpyme")
public class tblPymeEntity implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer idPyme;

   @Basic(optional = false)
   @NotNull
   @Size(min = 1, max = 45)
   @Column(name = "nombrepyme")
   private String nombrePyme;
   
   
   
   @JoinColumn(name = "idstatus", referencedColumnName = "id")
   @ManyToOne(optional = false)
   private tblStatusEntity statusEntity;


   public tblPymeEntity() {
	   
   }
   

public tblPymeEntity(Integer idPyme, String nombrePyme, tblStatusEntity statusEntity) {
	super();
	this.idPyme = idPyme;
	this.nombrePyme = nombrePyme;
	this.statusEntity = statusEntity;
}

private static final long serialVersionUID = -5290198995172316155L;

   public Integer getIdPyme() {
       return idPyme;
   }

   public void setIdPyme(Integer idPyme) {
       this.idPyme = idPyme;
   }

   public String getNombrePyme() {
		return nombrePyme;
	}

	public void setNombrePyme(String nombrePyme) {
		this.nombrePyme = nombrePyme;
	}

	public tblStatusEntity getStatusEntity() {
		return statusEntity;
	}

	public void setStatusEntity(tblStatusEntity StatusEntity) {
		this.statusEntity = StatusEntity;
	}

   

   @Override
   public String toString() {
       return "Pyme [idPyme=" + idPyme + ", NombrePyme=" + nombrePyme + ", Status=" + statusEntity + "]";
   }

   @Override
   public int hashCode() {
       final int prime = 31;
       int result = 1;
       result = prime * result + ((idPyme == null) ? 0 : idPyme.hashCode());
       result = prime * result + ((nombrePyme == null) ? 0 : nombrePyme.hashCode());
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
       tblPymeEntity other = (tblPymeEntity) obj;
       if (idPyme == null) {
           if (other.idPyme != null)
               return false;
       } else if (!idPyme.equals(other.idPyme))
           return false;
       if (nombrePyme == null) {
           if (other.nombrePyme != null)
               return false;
       } else if (!nombrePyme.equals(other.nombrePyme))
           return false;
       if (statusEntity == null) {
           if (other.statusEntity != null)
               return false;
       } else if (!statusEntity.equals(other.statusEntity))
           return false;
       return true;
   }

}
