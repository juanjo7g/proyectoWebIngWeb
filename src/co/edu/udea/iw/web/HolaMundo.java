package co.edu.udea.iw.web;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("hola")
public class HolaMundo {

	// @GET
	// @Produces(MediaType.TEXT_PLAIN)
	// public String saludar() {
	// return "Hola Mundo!";
	// }

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String saludar(@QueryParam("nombre") String nombre, @QueryParam("apellido") String apellido) {
		return "Hola: " + nombre + " " + apellido;
	}

	// @GET
	// @Produces(MediaType.TEXT_PLAIN)
	// @Path("{nombre}/{apellido}")
	// public String saludar(@PathParam("nombre") String nombre,
	// @PathParam("apellido") String apellido) {
	// return "Hola: " + nombre + " " + apellido;
	// }
}
