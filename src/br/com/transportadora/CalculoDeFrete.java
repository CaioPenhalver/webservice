package br.com.transportadora;

import br.com.transportadora.clientgov.Imposto;
import br.com.transportadora.clientgov.servico.Governo;

public class CalculoDeFrete {

	public double calcularFrete(Frete frete){ 
		double freteSemImposto = (frete.getNumeroDeProdutos() * 25) 
				+ (frete.getValorTotalDaRemessa() * 0.01);
		return freteSemImposto * calularImpostos() + freteSemImposto;
				 
	}
	
	private double calularImpostos(){
		Governo governo = new Governo();
		double impostoTotal = 0;
		try {
			
			for(Imposto imposto : governo.getImposto()){
				impostoTotal += imposto.getAliquota(); 
			}
		} catch (Exception e) {
			impostoTotal = 0;
		}
		return impostoTotal;
	} 
}
