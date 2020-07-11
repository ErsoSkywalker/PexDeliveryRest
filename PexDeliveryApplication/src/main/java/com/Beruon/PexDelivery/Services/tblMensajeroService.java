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
import com.Beruon.PexDelivery.dto.tblMensajeroDto;
import com.Beruon.PexDelivery.dao.MensajeDao;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
public class tblMensajeroService {

	@Autowired
	private tblMensajeroAssembler tblMensajeroAssembler;
	
    @Autowired
    private tblMensajeroRepository tblMensajeroRepository;
    
    @Autowired
    private tblTamanoRepository tblTamanoRepository;
    
    @Autowired
    private MensajeDao MensajeDao;
	
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
    
    public Response loginMensajero(tblMensajeroDto Dto) {
    	String Mensaje = MensajeDao.loginMensajero(Dto).getMensaje();
    	return (Mensaje.equalsIgnoreCase("0"))? Response.ok("{\"Mensaje\":\"No se ha encontrado Mensajero con esas credenciales\"}").build() : Response.ok(tblMensajeroAssembler.toResource(tblMensajeroRepository.findOne(Integer.parseInt(Mensaje)))).build();
    }
    
}
