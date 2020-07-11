package com.Beruon.PexDelivery.Resources;


import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Services.tblCodigosPostalesService;
import com.Beruon.PexDelivery.dto.tblCodigosPostalesDto;
@Component
@Path("/CodigosPostales")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class tblCodigosPostalesResource {
	
	@Autowired
	private tblCodigosPostalesService tblCodigosPostalesService;
	
    @GET
    public Response getCodigosPostales() {
        return tblCodigosPostalesService.getCodigosPostales();
    }
    
    @GET
    @Path("/{idCodigoPostal}")
    public Response getCodigoPostalById(@PathParam("idCodigoPostal") Integer idCodigoPostal) {
    	System.out.println(idCodigoPostal);
    	return tblCodigosPostalesService.getCodigoPostalById(idCodigoPostal);
    }
    
    @POST
    @Path("/AgregarCodigosPostales")
    public Response agregarCodigosPostales(tblCodigosPostalesDto Dto) {
    	return tblCodigosPostalesService.agregarCodigoPostal(Dto);
    }
}
