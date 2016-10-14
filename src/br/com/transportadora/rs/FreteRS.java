package br.com.transportadora.rs;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.transportadora.Frete;
import br.com.transportadora.Remessa;

@Path("frete")
public class FreteRS {

	@POST
	@Path("calcular")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response calcularFrete(Frete frete){
		Response res = new Response();
		res.setMessage("calcularFrete is working");
		return res;
	}
	
	@POST
	@Path("gerar")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response gerarFrete(Remessa remessa){
		Response res = new Response();
		res.setMessage("gerarFrete is working");
		return res;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTest(){
		return "It works";
	}
	
}
