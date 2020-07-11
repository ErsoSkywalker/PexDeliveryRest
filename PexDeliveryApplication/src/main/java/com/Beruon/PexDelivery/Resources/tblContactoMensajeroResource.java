package com.Beruon.PexDelivery.Resources;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Assembler.tblContactoMensajeroAssembler;
import com.Beruon.PexDelivery.Entities.tblContactoMensajeroEntity;
import com.Beruon.PexDelivery.Repositories.tblContactoMensajeroRepository;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
@Path("/ContactosMensajero")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class tblContactoMensajeroResource {

	@Autowired
	private tblContactoMensajeroAssembler tblContactoMensajeroAssembler;
	
    @Autowired
    private tblContactoMensajeroRepository tblContactoMensajeroRepository;
 
    @GET
    public Response getContactosPersona() {
        ArrayList<tblContactoMensajeroEntity> ContactosMensajero = Lists.newArrayList(tblContactoMensajeroRepository.findAll());
        return Response.ok(tblContactoMensajeroAssembler.toResources(ContactosMensajero)).build();
    }
	
}
