package br.com.transportadora;

public class CalculoDeFrete {

	public double calcularFrete(Frete frete){ 
		return (frete.getNumeroDeProdutos() * 25) 
				+ (frete.getValorTotalDaRemessa() * 0.01)
				+ calularImpostos(); 
	}
	
	private double calularImpostos(){
		return 13;
	} 
}
