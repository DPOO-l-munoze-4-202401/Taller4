package uniandes.dpoo.aerolinea.modelo;

import java.util.Set;

public class Avion {
	private String nombre;
	private int capacidad;
	
    public Avion(String nombre, int capacidad) {
    	this.capacidad = capacidad;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

}
