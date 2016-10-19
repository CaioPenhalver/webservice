package br.com.transportadora.rs;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.transportadora.CalculoDeFrete;
import br.com.transportadora.DBMock;
import br.com.transportadora.Frete;
import br.com.transportadora.Remessa;

@Path("frete")
public class FreteRS {

	@POST
	@Path("calcular")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response calcularFrete(Frete frete){
		CalculoDeFrete calcFrete = new CalculoDeFrete();
		Response res = new Response();
		res.setvalue(calcFrete.calcularFrete(frete));
		res.setMessage("Cálculo do frete");
		return res;
	}
	
	@POST
	@Path("gerar")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response gerarFrete(Remessa remessa){
		CalculoDeFrete calcFrete = new CalculoDeFrete();
		remessa.setValorFrete(
				calcFrete.calcularFrete(remessa.getFrete()));
		DBMock.addRemessa(remessa);
		Response res = new Response();
		res.setMessage("Frete gerado");
		return res;
	}
	
	
}
