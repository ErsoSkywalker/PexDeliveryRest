package com.Beruon.PexDelivery.Services;

import java.util.ArrayList;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Assembler.tblMensajeroAssembler;
import com.Beruon.PexDelivery.Entities.tblMensajeroEntity;
import com.Beruon.PexDelivery.Entities.tblTamanoEntity;
import com.Beruon.PexDelivery.Repositories.tblMensajeroRepository;
import com.Beruon.PexDelivery.Repositories.tblTamanoRepository;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
public class tblMensajeroService {

	@Autowired
	private tblMensajeroAssembler tblMensajeroAssembler;
	
    @Autowired
    private tblMensajeroRepository tblMensajeroRepository;
    
    @Autowired
    private tblTamanoRepository tblTamanoRepository;
	
    public Response getMensajeros() {
    	 ArrayList<tblMensajeroEntity> Mensajeros = Lists.newArrayList(tblMensajeroRepository.findAll());
         return Response.ok(tblMensajeroAssembler.toResources(Mensajeros)).build();
    }
    
    public Response getMensajeroByID(Integer idMensajero) {
    	return Response.ok(tblMensajeroAssembler.toResource(tblMensajeroRepository.findOne(idMensajero))).build();
    }
    
    public Response getMensajeroByTamano(Integer idTamano) {
    	return Response.ok(tblMensajeroAssembler.toResources(tblMensajeroRepository.findByTamanoEntity(tblTamanoRepository.findOne(idTamano)))).build();
    }
    
}
