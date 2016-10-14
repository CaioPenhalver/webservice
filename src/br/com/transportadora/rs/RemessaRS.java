package br.com.transportadora.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("remessa")
public class RemessaRS {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarRemessa(){
		return null;
	}
	
}
