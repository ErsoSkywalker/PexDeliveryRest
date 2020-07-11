package com.Beruon.PexDelivery.Resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.dao.MensajeDao;

@Component
@Path("/Mensaje")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MensajeResource {

	@Autowired
    private MensajeDao MensajeDao;
	
	@GET
    public Response getMensaje() {
        return Response.ok(MensajeDao.ImprimirMensaje()).build();
    }
	
}
