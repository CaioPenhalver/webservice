package br.com.transportadora;

import java.util.ArrayList;
import java.util.List;

public class DBMock {

	private static List<Remessa> remessas = new ArrayList<>();
	private static List<Usuario> usuarios = new ArrayList<>(); 
	
	static{
		Usuario usuarioCliente = new Usuario();
		usuarioCliente.setAdmin(false);
		usuarioCliente.setNome("cliente");
		usuarioCliente.setSenha("2468");
		Usuario usuarioAdmin = new Usuario();
		usuarioAdmin.setAdmin(true);
		usuarioAdmin.setNome("admin");
		usuarioAdmin.setSenha("1357");
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
