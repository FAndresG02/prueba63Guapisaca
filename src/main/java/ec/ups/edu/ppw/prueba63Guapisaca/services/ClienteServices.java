package ec.ups.edu.ppw.prueba63Guapisaca.services;

import java.util.List;

import ec.edu.ups.ppw.prueba63Guapisaca.Cliente;
import ec.edu.ups.ppw.prueba63Guapisaca.bussines.GestionClientes;
import ec.ups.edu.ppw.prueba63Guapisaca.services.ErrorMessage;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("clientes")
public class ClienteServices {
	@Inject
	private GestionClientes gClientes;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	//@Produces("application/json")
	public Response leer(@QueryParam("dni") String cedula, @QueryParam("nombre") String nombre,
			@QueryParam("direccion") String direccion, @QueryParam("deuda") double deuda) {
		try{
			System.out.println("cedula " +  cedula + " nom=" + nombre + " Direccion"
					 + direccion + " Deuda: " + deuda);
			Cliente cli = gClientes.getClientePorCedula(cedula);
			return Response.ok(cli).build();
		}catch (Exception e) {
			// TODO: handle exception
			ErrorMessage error = new ErrorMessage(4, "Cliente no existe");
			return Response.status(Response.Status.NOT_FOUND)
					.entity(error)
					.build();
		}
	}
	
	@GET
	@Path("{dni}/{nombre}")
	@Produces(MediaType.APPLICATION_JSON)
	//@Produces("application/json")
	public Response leer2(@PathParam("dni") String cedula, @PathParam("nombre") String nombre,
			@QueryParam("direccion") String direccion, @QueryParam("deuda") double deuda) {
		try{
			System.out.println("cedula " +  cedula + " nom=" + nombre + " Direccion"
					 + direccion + " Deuda: " + deuda);
			Cliente cli = gClientes.getClientePorCedula(cedula);
			return Response.ok(cli).build();
		}catch (Exception e) {
			// TODO: handle exception
			ErrorMessage error = new ErrorMessage(4, "Cliente no existe");
			return Response.status(Response.Status.NOT_FOUND)
					.entity(error)
					.build();
		}
	}
}
