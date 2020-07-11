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

import com.Beruon.PexDelivery.Assembler.tblEnvioAssembler;
import com.Beruon.PexDelivery.Entities.tblEnvioEntity;
import com.Beruon.PexDelivery.Repositories.tblEnvioRepository;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
@Path("/Envios")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class tblEnvioResource {
	@Autowired
	private tblEnvioAssembler tblEnvioAssembler;
	
    @Autowired
    private tblEnvioRepository tblEnvioRepository;
 
    @GET
    public Response getEmpleadosPyme() {
        ArrayList<tblEnvioEntity> Envios = Lists.newArrayList(tblEnvioRepository.findAll());
        return Response.ok(tblEnvioAssembler.toResources(Envios)).build();
    }
}
