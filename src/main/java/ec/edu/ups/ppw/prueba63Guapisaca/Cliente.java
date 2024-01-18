package ec.edu.ups.ppw.prueba63Guapisaca;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente {

	@Id
	private int codigo;
	private String dni;
	private String nombre;
	private String fecha;
	private int  deuda;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codifo) {
		this.codigo = codifo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	public int getDeuda() {
		return deuda;
	}
	public void setDeuda(int deuda) {
		this.deuda = deuda;
	}
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", dni=" + dni + ", nombre=" + nombre + ", fecha=" + fecha + ", deuda="
				+ deuda + "]";
	}
	
	
	
}