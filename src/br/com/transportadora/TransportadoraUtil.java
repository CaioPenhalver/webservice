package br.com.transportadora;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class TransportadoraUtil {

	static final String hash = ".kjfkdljgkdjsidjkljghafjhdajfhsjfhajfhkjfasshj";
	
	public static String criarToken(String documento){
		return Base64.getEncoder().encodeToString(
				(Base64.getEncoder().encodeToString(documento.getBytes())+hash).getBytes());
	}
	
	public static String decodeToken(String token) throws UnsupportedEncodingException{
		byte[] x = Base64.getDecoder().decode(token);
		String decodedToken = new String(x, "UTF-8");
		return new String(Base64.getDecoder().
				decode(decodedToken.replace(hash, "")), "UTF-8");
	}
}
