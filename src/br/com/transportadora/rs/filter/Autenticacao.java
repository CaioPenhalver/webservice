package br.com.transportadora.rs.filter;

import java.io.IOException;
import java.util.Base64;
import java.util.StringTokenizer;

import br.com.transportadora.DBMock;
import br.com.transportadora.Usuario;

public class Autenticacao {
	
	private Usuario autenticar(String authString){
		if(authString == null) return null;
		
		final String encodedUserPassword = authString.replaceFirst("Basic" + " ", "");
		String usernameAndPassword = null;
		try{
			byte[] decodedBytes = Base64.getDecoder().decode(encodedUserPassword);
			usernameAndPassword = new String(decodedBytes, "UTF-8");
		}catch(IOException e){
			e.printStackTrace();
		}
		final StringTokenizer tokenizer = new StringTokenizer(usernameAndPassword, ":");
		if(tokenizer.countTokens() < 2) return null;
		final String username = tokenizer.nextToken();
		final String password = tokenizer.nextToken();
		Usuario usuario = DBMock.getUsuario(username);
		if(usuario == null) return null;
		if(usuario.getNome().equals(username) && usuario.getSenha().equals(password)){
			return usuario;
		}
		return null;
	}
	
	public boolean autenticarCliente(String authString){
		Usuario usuario = autenticar(authString);
		if(usuario == null || usuario.isAdmin())
			return false;
		else
			return true;	
	}
	
	public boolean autenticarAdmin(String authString){
		Usuario usuario = autenticar(authString);
		if(usuario == null || !usuario.isAdmin())
			return false;
		else
			return true;	
	}
}
