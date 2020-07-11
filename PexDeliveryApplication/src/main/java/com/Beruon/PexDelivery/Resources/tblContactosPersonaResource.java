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

import com.Beruon.PexDelivery.Assembler.tblContactosPersonaAssembler;
import com.Beruon.PexDelivery.Entities.tblContactosPersonaEntity;
import com.Beruon.PexDelivery.Repositories.tblContactosPersonaRepository;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
@Path("/ContactosPersona")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class tblContactosPersonaResource {

	@Autowired
	private tblContactosPersonaAssembler tblContactosPersonaAssembler;
	
    @Autowired
    private tblContactosPersonaRepository tblContactosPersonaRepository;
 
    @GET
    public Response getContactosPersona() {
        ArrayList<tblContactosPersonaEntity> ContactosPersona = Lists.newArrayList(tblContactosPersonaRepository.findAll());
        return Response.ok(tblContactosPersonaAssembler.toResources(ContactosPersona)).build();
    }
	
}
