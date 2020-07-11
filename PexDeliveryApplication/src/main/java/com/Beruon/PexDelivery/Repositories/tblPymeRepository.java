package com.Beruon.PexDelivery.Repositories;


import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.Beruon.PexDelivery.Entities.tblPymeEntity;
import com.Beruon.PexDelivery.Entities.tblStatusEntity;

public interface tblPymeRepository extends CrudRepository<tblPymeEntity, Integer>{

	
	List<tblPymeEntity> findByStatusEntity(tblStatusEntity statusEntity);
	
	
}
