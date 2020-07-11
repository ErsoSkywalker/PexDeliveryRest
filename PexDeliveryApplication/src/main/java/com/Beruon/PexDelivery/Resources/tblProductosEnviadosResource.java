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

import com.Beruon.PexDelivery.Entities.tblProductosEnviadosEntity;
import com.Beruon.PexDelivery.Repositories.tblProductosEnviadosRepository;

import com.Beruon.PexDelivery.Assembler.tblProductosEnviadosAssembler;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
@Path("/ProductosEnviados")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class tblProductosEnviadosResource {
	@Autowired
	private tblProductosEnviadosAssembler tblProductosEnviadosAssembler;
	
    @Autowired
    private tblProductosEnviadosRepository tblProductosEnviadosRepository;
 
    @GET
    public Response getEmpleadosPyme() {
        ArrayList<tblProductosEnviadosEntity> ProductosEnviados = Lists.newArrayList(tblProductosEnviadosRepository.findAll());
        return Response.ok(tblProductosEnviadosAssembler.toResources(ProductosEnviados)).build();
    }
}
