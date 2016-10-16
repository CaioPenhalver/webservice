package br.com.transportadora.clientgov.servico;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import br.com.transportadora.clientgov.Exception_Exception;
import br.com.transportadora.clientgov.WebServiceNF;
import br.com.transportadora.clientgov.WebServiceNFService;

public class Governo {

	public void getImposto(){
		
		WebServiceNF port = new WebServiceNFService().getWebServiceNFPort();
		Map<String, Object> reqContext = ((BindingProvider)port).getRequestContext();
		Map<String, List<String>> headers = new HashMap<>();
		headers.put("cpf", Collections.singletonList("12345678901"));
		headers.put("password", Collections.singletonList("123"));
		reqContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		try {
			System.out.println(port.listarImpostos());
		} catch (Exception_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
