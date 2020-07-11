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

import com.Beruon.PexDelivery.Assembler.tblEmpleadosPymeAssembler;
import com.Beruon.PexDelivery.Entities.tblEmpleadosPymeEntity;
import com.Beruon.PexDelivery.Repositories.tblEmpleadosPymeRepository;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
@Path("/EmpleadosPyme")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class tblEmpleadosPymeResource {
 
	@Autowired
	private tblEmpleadosPymeAssembler tblEmpleadosPymeAssembler;
	
    @Autowired
    private tblEmpleadosPymeRepository tblEmpleadosPymeRepository;
 
    @GET
    public Response getEmpleadosPyme() {
        ArrayList<tblEmpleadosPymeEntity> EmpleadosPyme = Lists.newArrayList(tblEmpleadosPymeRepository.findAll());
        return Response.ok(tblEmpleadosPymeAssembler.toResources(EmpleadosPyme)).build();
    }
 
}
