package com.Beruon.PexDelivery.Resources;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Assembler.tblMensajeroAssembler;
import com.Beruon.PexDelivery.Entities.tblMensajeroEntity;
import com.Beruon.PexDelivery.Repositories.tblMensajeroRepository;
import com.Beruon.PexDelivery.Services.tblMensajeroService;
import com.Beruon.PexDelivery.dto.tblMensajeroDto;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
@Path("/Mensajeros")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class tblMensajeroResource {

	@Autowired
	private tblMensajeroService tblMensajeroService;
 
    @GET
    public Response getMensajero() {
       return tblMensajeroService.getMensajeros();
    }
    
    @GET
    @Path("/{idMensajero}")
    public Response getMensajeroById(@PathParam("idMensajero") Integer idMensajero) {
    	return tblMensajeroService.getMensajeroByID(idMensajero);
    }
    
    @GET
    @Path("/GetMensajeroByTamano/{idTamano}")
    public Response getMensajeroByTamano(@PathParam("idTamano") Integer idTamano) {
    	return tblMensajeroService.getMensajeroByTamano(idTamano);
    }
    
    @POST
    @Path("/Login")
    public Response loginMensajero(tblMensajeroDto Dto) {
    	return tblMensajeroService.loginMensajero(Dto);
    }
    
    
    @POST 
    @Path("/AgregarMensajero/{idTamano}")
    public Response agregarMensajero(tblMensajeroDto Dto, @PathParam("idTamano") Integer idTamano) {
    	return tblMensajeroService.agregarMensajero(Dto, idTamano);
    }
	
}
