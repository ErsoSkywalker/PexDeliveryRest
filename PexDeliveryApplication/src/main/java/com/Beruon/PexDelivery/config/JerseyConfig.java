package com.Beruon.PexDelivery.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Resources.*;

@Component
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig(){
		register(tblStatusResource.class);
		register(tblTipoContactoResource.class);
		register(tblPymeResource.class);
		register(tblContactosPymeResource.class);
		register(tblEmpleadosPymeResource.class);
		register(tblDireccionesPymeResource.class);
		register(tblProductosResource.class);
		register(tblProductosEnviadosResource.class);
		register(tblCodigosPostalesResource.class);
		register(tblDireccionEnvioResource.class);
		register(tblPersonaResource.class);
		register(tblContactosPersonaResource.class);
		register(tblDireccionesPersonaResource.class);
		register(tblTamanoResource.class);
		register(tblMensajeroResource.class);
		register(tblContactoMensajeroResource.class);
		register(tblEnvioResource.class);
		register(MensajeResource.class);
	}
	
}
