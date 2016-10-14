package br.com.transportadora;

import java.util.ArrayList;
import java.util.List;

public class DbMock {

	private static List<Remessa> remessas = new ArrayList<>();
	private static List<Usuario> usuarios = new ArrayList<>(); 
	
	public static Usuario getUsuario(String documento){
		for(Usuario usuario : usuarios){
			if(usuario.getDocumento().equals(documento))
				return usuario;
		}
		return null;
	}
	
	public static void addUsuario(Usuario usuario){
		usuarios.add(usuario);
	}
	
	public static List<Remessa> getRemessas(){
		return remessas;
	}
	
	public static void addRemessa(Remessa remessa){
		remessas.add(remessa);
	}
}
