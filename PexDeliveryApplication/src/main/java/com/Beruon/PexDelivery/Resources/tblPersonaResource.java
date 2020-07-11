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

import com.Beruon.PexDelivery.Assembler.tblPersonaAssembler;
import com.Beruon.PexDelivery.Entities.tblPersonaEntity;
import com.Beruon.PexDelivery.Repositories.tblPersonaRepository;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
@Path("/Personas")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class tblPersonaResource {

	@Autowired
	private tblPersonaAssembler tblPersonaAssembler;
	
    @Autowired
    private tblPersonaRepository tblPersonaRepository;
 
    @GET
    public Response getEmpleadosPyme() {
        ArrayList<tblPersonaEntity> Personas = Lists.newArrayList(tblPersonaRepository.findAll());
        return Response.ok(tblPersonaAssembler.toResources(Personas)).build();
    }
	
}
