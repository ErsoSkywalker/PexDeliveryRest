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

import com.Beruon.PexDelivery.Assembler.tblDireccionEnvioAssembler;
import com.Beruon.PexDelivery.Entities.tblDireccionEnvioEntity;
import com.Beruon.PexDelivery.Repositories.tblDireccionEnvioRepository;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
@Path("/DireccionEnvio")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class tblDireccionEnvioResource {

	@Autowired
	private tblDireccionEnvioAssembler tblDireccionEnvioAssembler;
	
    @Autowired
    private tblDireccionEnvioRepository tblDireccionEnvioRepository;
 
    @GET
    public Response getDirecciones() {
        ArrayList<tblDireccionEnvioEntity> DireccionEnvio = Lists.newArrayList(tblDireccionEnvioRepository.findAll());
        return Response.ok(tblDireccionEnvioAssembler.toResources(DireccionEnvio)).build();
    }
	
}
