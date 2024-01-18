package ec.ups.edu.ppw.prueba63Guapisaca.dao;
import java.util.List;

import ec.edu.ups.ppw.prueba63Guapisaca.Cliente;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class ClienteDao {
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Cliente cliente) {
		em.persist(cliente);
	}
	
	public void update(Cliente cliente) {
		em.merge(cliente);
	}
	
	public Cliente read(int codigo) {
		Cliente cliente = em.find(Cliente.class, codigo);
		return cliente;
	}
	
	public Cliente getClientePorCedula(String cedula){
		String jpql = "SELECT c FROM Cliente c WHERE c.dni = :cedula";
		Query q = em.createQuery(jpql, Cliente.class);
		q.setParameter("cedula", cedula);
		List<Cliente> clientes = q.getResultList();
		if(clientes.size()>0)
			return clientes.get(0);
		return null;
	}

}
