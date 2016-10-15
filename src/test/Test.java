package test;

import java.io.UnsupportedEncodingException;

import br.com.transportadora.TransportadoraUtil;

public class Test {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String token = TransportadoraUtil.criarToken("caio");
		System.out.println(token);
		String decodedToken = TransportadoraUtil.decodeToken(token);
		System.out.println(decodedToken);
	}
}
