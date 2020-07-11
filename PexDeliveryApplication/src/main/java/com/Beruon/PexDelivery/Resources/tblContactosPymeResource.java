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

import com.Beruon.PexDelivery.Assembler.tblContactosPymeAssembler;
import com.Beruon.PexDelivery.Entities.tblContactosPymeEntity;
import com.Beruon.PexDelivery.Repositories.tblContactosPymeRepository;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
@Path("/ContactosPyme")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class tblContactosPymeResource {
 
	@Autowired
	private tblContactosPymeAssembler tblContactosPymeAssembler;
	
    @Autowired
    private tblContactosPymeRepository tblContactosPymeRepository;
 
    @GET
    public Response getPyme() {
        ArrayList<tblContactosPymeEntity> ContactosPyme = Lists.newArrayList(tblContactosPymeRepository.findAll());
        return Response.ok(tblContactosPymeAssembler.toResources(ContactosPyme)).build();
    }
 
}
