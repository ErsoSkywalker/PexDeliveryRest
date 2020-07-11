package com.Beruon.PexDelivery.Repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.Beruon.PexDelivery.Entities.tblMensajeroEntity;
import com.Beruon.PexDelivery.Entities.tblTamanoEntity;

public interface tblMensajeroRepository extends CrudRepository<tblMensajeroEntity, Integer>{

	List<tblMensajeroEntity> findByTamanoEntity(tblTamanoEntity tamanoEntity);
	
	
}
