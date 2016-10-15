package br.com.transportadora.rs;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.transportadora.DBMock;
import br.com.transportadora.Remessa;

@Path("remessa")
public class RemessaRS {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Remessa> listarRemessa(){
		return DBMock.getRemessas();
	}
	
}
