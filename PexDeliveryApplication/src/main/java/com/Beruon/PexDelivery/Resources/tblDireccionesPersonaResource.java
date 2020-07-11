package com.Beruon.PexDelivery.Resources;

import java.util.ArrayList;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Assembler.tblDireccionesPersonaAssembler;
import com.Beruon.PexDelivery.Entities.tblDireccionesPersonaEntity;
import com.Beruon.PexDelivery.Repositories.tblDireccionesPersonaRepository;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
@Path("/DireccionesPersona")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class tblDireccionesPersonaResource {

	@Autowired
	private tblDireccionesPersonaAssembler tblDireccionesPersonaAssembler;
	
    @Autowired
    private tblDireccionesPersonaRepository tblDireccionesPersonaRepository;
 
    @GET
    public Response getDirecciones() {
        ArrayList<tblDireccionesPersonaEntity> Direcciones = Lists.newArrayList(tblDireccionesPersonaRepository.findAll());
        return Response.ok(tblDireccionesPersonaAssembler.toResources(Direcciones)).build();
    }
    
    @GET
    @Path("/{idDireccion}")
    public Response getDireccionesById(@PathParam("idDireccion") Integer idDireccion) {
    	tblDireccionesPersonaEntity Direccion = tblDireccionesPersonaRepository.findOne(idDireccion);
        return Response.ok(tblDireccionesPersonaAssembler.toResource(Direccion)).build();
    }
	
}
