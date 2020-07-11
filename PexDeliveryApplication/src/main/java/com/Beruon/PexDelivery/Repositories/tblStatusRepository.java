package com.Beruon.PexDelivery.Repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.Beruon.PexDelivery.Entities.tblStatusEntity;

public interface tblStatusRepository extends CrudRepository<tblStatusEntity, Integer> {
	
	
	tblStatusEntity findByEstatus(String estatus);
	
	
}
