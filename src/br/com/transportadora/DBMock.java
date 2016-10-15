package br.com.transportadora;

import java.util.ArrayList;
import java.util.List;

public class DBMock {

	private static List<Remessa> remessas = new ArrayList<>();
	private static List<Usuario> usuarios = new ArrayList<>(); 
	
	static{
		Usuario usuarioCliente = new Usuario();
		usuarioCliente.setAdmin(false);
		usuarioCliente.setNome("Maria");
		usuarioCliente.setSenha("123");
		Usuario usuarioAdmin = new Usuario();
		usuarioAdmin.setAdmin(true);
		usuarioAdmin.setNome("Joao");
		usuarioAdmin.setSenha("456");
		usuarios.add(usuarioAdmin);
		usuarios.add(usuarioCliente);
	}
	
	public static Usuario getUsuario(String nome){
		for(Usuario usuario : usuarios){
			if(usuario.getNome().equals(nome))
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
		System.out.println(remessas);
	}
}
