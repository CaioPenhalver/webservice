/**
 * 
 */
package br.com.transportadora.clientgoverno;

import java.rmi.RemoteException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.soap.SOAPException;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import br.com.transportadora.clientgov.Exception_Exception;
import br.com.transportadora.clientgov.Imposto;
import br.com.transportadora.clientgov.WebServiceNF;
import br.com.transportadora.clientgov.WebServiceNFService;

/**
 * @author Rodrigo
 *
 */
public class GovernoService {
	
	private static final String USER_AUTH = "12345678901";
	private static final String PASS_AUTH = "123";
	private static final String ENDPOINT = "http://fiapgoverno.brazilsouth.cloudapp.azure.com:8080/Governo/WebServiceNF?wsdl";

	
	public static WebServiceNF get(){
		
		br.com.transportadora.clientgov.WebServiceNF port = new WebServiceNFService().getWebServiceNFPort();
		
		Map<String, Object> req_ctx = ((BindingProvider)port).getRequestContext();
		req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ENDPOINT);

        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put("cpf", Collections.singletonList(USER_AUTH));
        headers.put("password", Collections.singletonList(PASS_AUTH));
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
        
        return port;
		
	}
	
	public static void main(String[] args) throws SOAPException, Exception_Exception, Exception, RemoteException {
        WebServiceNF serviceNF = GovernoService.get();
        System.out.println("Calling Service: Listar Impostos");
        
        List<Imposto> impostos = serviceNF.listarImpostos();
        for (Imposto imposto : impostos) {
			System.out.println(imposto.getSigla() + ": " + imposto.getAliquota());
		}
				
	}
}
