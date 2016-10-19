package br.com.transportadora.clientgov.servico;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import br.com.transportadora.clientgov.Exception_Exception;
import br.com.transportadora.clientgov.Imposto;
import br.com.transportadora.clientgov.WebServiceNF;
import br.com.transportadora.clientgov.WebServiceNFService;

public class Governo {

	public List<Imposto> getImposto() throws Exception{
		
		WebServiceNF port = new WebServiceNFService().getWebServiceNFPort();
		Map<String, Object> requestContext = ((BindingProvider)port).getRequestContext();
		Map<String, List<String>> headers = new HashMap<String, List<String>>();

		headers.put("cpf", Collections.singletonList("12345678901"));
		headers.put("password", Collections.singletonList("123"));

		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		try {
			return port.listarImpostos();
		} catch (Exception_Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}
}
