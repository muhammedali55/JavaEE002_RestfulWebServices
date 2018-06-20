package com.vektorel.webservices;

//import javax.websocket.server.PathParam;
//yukarıda ki import kullanılırsa parametre boş gelir.

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("/test")
public class RestServices {

	@GET
	@Path("/hello/{msj}")
	@Produces("application/json")
	public String ilkmesaj(@PathParam("msj") String msj) {
	
		return "İlk Rest Mesajım...: "+msj;	
		
	}
	
	
	
}
