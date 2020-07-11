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

import com.Beruon.PexDelivery.Assembler.tblTamanoAssembler;
import com.Beruon.PexDelivery.Entities.tblTamanoEntity;
import com.Beruon.PexDelivery.Repositories.tblTamanoRepository;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
@Path("/Tamano")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class tblTamanoResource {

	@Autowired
	private tblTamanoAssembler tblTamanoAssembler;
	
    @Autowired
    private tblTamanoRepository tblTamanoRepository;
 
    @GET
    public Response getTamano() {
        ArrayList<tblTamanoEntity> Tamano = Lists.newArrayList(tblTamanoRepository.findAll());
        return Response.ok(tblTamanoAssembler.toResources(Tamano)).build();
    }
	
}
