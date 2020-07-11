package com.Beruon.PexDelivery.Repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Beruon.PexDelivery.Entities.tblDireccionesPymeEntity;
import com.Beruon.PexDelivery.Entities.tblPymeEntity;

@Repository
public interface tblDireccionesPymeRepository extends CrudRepository<tblDireccionesPymeEntity, Integer>{

	List<tblDireccionesPymeEntity> findByPymeEntity(tblPymeEntity pymeEntity);
	
	
	
	
}
