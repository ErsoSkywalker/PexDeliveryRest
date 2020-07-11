package com.Beruon.PexDelivery.Entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
* @author Christian Ontiveros
*
*/
@Entity
@Table(name = "tblestatus")
public class tblStatusEntity implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer id;

   @Column(name = "Estatus")
   private String estatus;

  
  

   private static final long serialVersionUID = -5290198995172316155L;

   public Integer getIdStatus() {
       return id;
   }

   public void setIdStatus(Integer id) {
       this.id = id;
   }

   public String getEstatus() {
       return estatus;
   }

   public void setEstatus(String Estatus) {
       this.estatus = Estatus;
   }

   

   @Override
   public String toString() {
       return "Status [idStatus=" + id + ", Estatus=" + estatus + "]";
   }

   @Override
   public int hashCode() {
       final int prime = 31;
       int result = 1;
       result = prime * result + ((id == null) ? 0 : id.hashCode());
       result = prime * result + ((estatus == null) ? 0 : estatus.hashCode());
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
       tblStatusEntity other = (tblStatusEntity) obj;
       if (id == null) {
           if (other.id != null)
               return false;
       } else if (!id.equals(other.id))
           return false;
       if (estatus == null) {
           if (other.estatus != null)
               return false;
       } else if (!estatus.equals(other.estatus))
           return false;
       return true;
   }
   
   public tblStatusEntity() {
	   
   }
   
   public tblStatusEntity(String estatus) {
	   this.estatus = estatus;
   }

}
