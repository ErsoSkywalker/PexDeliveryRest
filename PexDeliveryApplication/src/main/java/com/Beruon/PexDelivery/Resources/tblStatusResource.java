package com.Beruon.PexDelivery.Resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Assembler.tblStatusAssembler;
import com.Beruon.PexDelivery.Entities.tblStatusEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Repositories.tblStatusRepository;
import com.Beruon.PexDelivery.dto.tblStatusDto;

import com.Beruon.PexDelivery.Services.tblStatusServices;

import jersey.repackaged.com.google.common.collect.Lists;
 
/**
 * @author Christian Ontiveros
 *
 */
 
@Component
@Path("/Status")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class tblStatusResource {
 
	@Autowired
	private tblStatusAssembler tblStatusAssembler;
	
    @Autowired
    private tblStatusRepository tblStatusRepository;
    
    @Autowired
    private tblStatusServices tblStatusServices;
    
    private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);
 
    @GET
    public Response getEstatus() {
        ArrayList<tblStatusEntity> Estatus = Lists.newArrayList(tblStatusRepository.findAll());
        return Response.ok(tblStatusAssembler.toResources(Estatus)).build();
    }
    
    @POST
    @Path("/createStatus")
    public Response creaEstatus(tblStatusDto Estatus) {
    	tblStatusEntity Entidad = mapper.tblStatusDtoTotblStatusEntity(Estatus);
		tblStatusRepository.save(Entidad);
    	return Response.status(Status.CREATED).entity(Entidad).build();
    }
 
    @POST
    @Path("/InitStatus")
    public Response initEstatus(List<tblStatusDto> Estatus) {
    	tblStatusRepository.save(tblStatusServices.convertirDto(Estatus));
    	return Response.status(Status.CREATED).build();
    }
    
    
}
