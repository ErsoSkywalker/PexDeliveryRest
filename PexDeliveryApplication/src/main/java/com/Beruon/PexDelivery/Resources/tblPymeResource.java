package com.Beruon.PexDelivery.Resources;



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

import com.Beruon.PexDelivery.Services.tblPymeServices;
import com.Beruon.PexDelivery.dto.tblPymeDto;


@Component
@Path("/Pyme")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class tblPymeResource {
 
	@Autowired
    private tblPymeServices tblPymeServices;
    
    
    @GET
    public Response getPyme() {
    	return Response.ok(tblPymeServices.getListaPymes()).build();
    }
    
    @GET
    @Path("/{idPyme}")
    public Response getPymeById(@PathParam("idPyme") Integer idPyme) {
    	return Response.ok(tblPymeServices.getPymeById(idPyme)).build();
    }
 
    @GET
    @Path("/GetPymeByStatus/{idStatus}")
    public Response getPymeByStatus(@PathParam("idStatus") Integer idStatus) {
    	return Response.ok(tblPymeServices.getPymeByStatus(idStatus)).build();
    }
    
    @POST
    @Path("/CreatePyme")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createPyme(tblPymeDto PymeDto) {
    	return Response.ok(tblPymeServices.crearPyme(PymeDto)).build();
    }
    
    @POST
    @Path("/CambiarStatusPyme")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response cambiarStatusPyme(tblPymeDto PymeDto) {
    	return (tblPymeServices.cambiarStatusPyme(PymeDto.getIdPyme()).getMensaje().equalsIgnoreCase("0"))?Response.status(Status.NOT_FOUND.getStatusCode()).build():Response.ok(tblPymeServices.getPymeById(PymeDto.getIdPyme())).build();
    }
    
    @POST
    @Path("/EditarPyme")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response editarPyme(tblPymeDto PymeDto) {
    	return (tblPymeServices.editarPyme(PymeDto.getIdPyme(), PymeDto.getNombrePyme()).getMensaje().equalsIgnoreCase("0"))?Response.status(Status.NOT_FOUND.getStatusCode()).build():Response.ok(tblPymeServices.getPymeById(PymeDto.getIdPyme())).build();
    }
    
    /*
    @Path("/DeletePyme/{idPyme}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deletePyme(@PathParam("idPyme") Integer idPyme) {
    	tblPymeRepository.delete(idPyme);
    	return Response.status(Status.NO_CONTENT).build();
    }*/
    
    
}