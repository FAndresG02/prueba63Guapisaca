package ec.edu.ups.ppw.prueba63Guapisaca.bussines;

import java.util.List;

import ec.edu.ups.ppw.prueba63Guapisaca.Cliente;
import ec.ups.edu.ppw.prueba63Guapisaca.dao.ClienteDao;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionClientes {
	@Inject
	private ClienteDao daoCliente;  

	public void guardarClientes(Cliente cliente) {
		Cliente cli = daoCliente.read(cliente.getCodigo());
		if (cli != null){
			daoCliente.update(cliente);
		}else {
			daoCliente.insert(cliente);
		}
	}
	
	public Cliente getClientePorCedula(String cedula) throws Exception{
		
		if(cedula.length()!=10)
			throw new Exception("Cedula incorrecta");
			
		return daoCliente.getClientePorCedula(cedula);
	}
}
