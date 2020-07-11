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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Assembler.tblTipoContactoAssembler;
import com.Beruon.PexDelivery.Entities.tblTipoContactoEntity;
import com.Beruon.PexDelivery.Repositories.tblTipoContactoRepository;
import com.Beruon.PexDelivery.Services.tblTipoContactoServices;
import com.Beruon.PexDelivery.dto.tblTipoContactoDto;

import jersey.repackaged.com.google.common.collect.Lists;

/**
 * @author Christian Ontiveros
 *
 */
 
@Component
@Path("/TipoContacto")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class tblTipoContactoResource {
 
	@Autowired
	private tblTipoContactoAssembler tblTipoContactoAssembler;
	
    @Autowired
    private tblTipoContactoRepository tblTipoContactoRepository;
 
    @Autowired
    private tblTipoContactoServices tblTipoContactoServices;
    
    @GET
    public Response getTipos() {
        ArrayList<tblTipoContactoEntity> Tipos = Lists.newArrayList(tblTipoContactoRepository.findAll());
        return Response.ok(tblTipoContactoAssembler.toResources(Tipos)).build();
    }
    
    @POST
    @Path("/initTipoContacto")
    public Response initTipoContacto(List<tblTipoContactoDto> TiposDeContacto) {
		tblTipoContactoRepository.save(tblTipoContactoServices.convertirListaTipoContactoDto(TiposDeContacto));
    	return Response.status(Status.CREATED).build();
    }
    
 
}
