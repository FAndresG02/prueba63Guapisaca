package ec.edu.ups.ppw.prueba63Guapisaca.bussines;

import java.util.Date;
import java.util.List;

import ec.edu.ups.ppw.prueba63Guapisaca.Cliente;
import ec.ups.edu.ppw.prueba63Guapisaca.dao.ClienteDao;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class GestionDatos {
	@Inject
	private ClienteDao daoCliente;
	
	@PostConstruct
	public void init() {		
		Cliente cliente = new Cliente();
		cliente.setCodigo(1);
		cliente.setDni("0103709911");
		cliente.setNombre("Jose Torres");
		cliente.setFecha("25 de Septiembre");
		cliente.setDeuda(30);
		
		daoCliente.insert(cliente);
		
		cliente = new Cliente();
		cliente.setCodigo(2);
		cliente.setDni("0123694875");
		cliente.setNombre("Manuea Cañizares");
		cliente.setFecha("12 de Octubre");
		cliente.setDeuda(40);
		
		daoCliente.insert(cliente);
		
		cliente = new Cliente();
		cliente.setCodigo(3);
		cliente.setDni("0145786935");
		cliente.setNombre("Daniela Arevalo");
		cliente.setFecha("1 de Marzo");
		cliente.setDeuda(80);
		
		daoCliente.insert(cliente);

	}
}
