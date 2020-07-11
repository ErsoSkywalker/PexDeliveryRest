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

import com.Beruon.PexDelivery.Assembler.tblProductosAssembler;
import com.Beruon.PexDelivery.Entities.tblProductosEntity;
import com.Beruon.PexDelivery.Repositories.tblProductosRepository;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
@Path("/Productos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class tblProductosResource {

	@Autowired
	private tblProductosAssembler tblProductosAssembler;
	
    @Autowired
    private tblProductosRepository tblProductosRepository;
 
    @GET
    public Response getEmpleadosPyme() {
        ArrayList<tblProductosEntity> Productos = Lists.newArrayList(tblProductosRepository.findAll());
        return Response.ok(tblProductosAssembler.toResources(Productos)).build();
    }
	
}
