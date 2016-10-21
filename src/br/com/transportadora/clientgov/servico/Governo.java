package br.com.transportadora.clientgov.servico;

import java.util.List;

import br.com.transportadora.clientgov.Exception_Exception;
import br.com.transportadora.clientgov.Imposto;
import br.com.transportadora.clientgov.WebServiceNF;
import br.com.transportadora.clientgoverno.GovernoService;


public class Governo {

	public List<Imposto> getImposto() throws Exception{
		
		WebServiceNF port = GovernoService.get();
		try {
			return port.listarImpostos();
		} catch (Exception_Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}
}
