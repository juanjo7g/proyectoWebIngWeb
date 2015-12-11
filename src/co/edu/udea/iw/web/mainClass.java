package co.edu.udea.iw.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hola")
public class mainClass {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String saludar() {
		return "Hola Mundo";
	}

}
