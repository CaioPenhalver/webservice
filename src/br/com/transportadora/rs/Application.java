package br.com.transportadora.rs;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("resources")
public class Application extends ResourceConfig{

	public Application(){
		packages("br.com.transportadora.rs");
	}
}
