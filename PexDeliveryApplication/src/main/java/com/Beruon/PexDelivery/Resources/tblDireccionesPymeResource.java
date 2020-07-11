package com.Beruon.PexDelivery.Resources;

import java.util.ArrayList;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Assembler.tblDireccionesPymeAssembler;
import com.Beruon.PexDelivery.Entities.tblDireccionesPymeEntity;
import com.Beruon.PexDelivery.Repositories.tblDireccionesPymeRepository;
import com.Beruon.PexDelivery.Repositories.tblPymeRepository;
import com.Beruon.PexDelivery.Services.tblDireccionesPymeServices;
import com.Beruon.PexDelivery.dto.tblDireccionesPymeDto;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
@Path("/DireccionesPyme")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class tblDireccionesPymeResource {
 
	
    @Autowired
    private tblDireccionesPymeServices tblDireccionesPymeServices;
    
 
    @GET
    public Response getDirecciones() {
        return Response.ok(tblDireccionesPymeServices.getAllPymes()).build();
    }
    
    @GET
    @Path("/{idDireccion}")
    public Response getDireccionesById(@PathParam("idDireccion") Integer idDireccion) {
        return Response.ok(tblDireccionesPymeServices.getPymeById(idDireccion)).build();
    }
    
    @GET
    @Path("/GetPymeAddressByidPyme/{idPyme}")
    public Response getPymeAddressByidPyme(@PathParam("idPyme") Integer idPyme) {
    	return Response.ok(tblDireccionesPymeServices.getPymeAddressByidPyme(idPyme)).build();
    }
 
    @POST
    @Path("/CreateDireccionesPyme/{idPyme}")
    public Response createDireccionesPyme(tblDireccionesPymeDto DireccionesPyme, @PathParam("idPyme") Integer idPyme) {
    	return Response.ok(tblDireccionesPymeServices.createDireccionPyme(DireccionesPyme,idPyme)).build();
    }
    
    @POST
    @Path("/CambiarStatusDireccionPyme")
    public Response cambiarStatusDireccionesPyme(tblDireccionesPymeDto DireccionesPyme) {
    	return tblDireccionesPymeServices.cambiarStatusDireccionPyme(DireccionesPyme);
    }
    
    @POST
    @Path("/EditarDireccionesPyme")
    public Response editarDireccionesPyme(tblDireccionesPymeDto DireccionesPyme) {
    	return tblDireccionesPymeServices.editarDireccionPyme(DireccionesPyme);
    }
    
}
