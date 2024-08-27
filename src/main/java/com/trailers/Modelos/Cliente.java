package com.trailers.Modelos;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "idper")
public class Cliente extends Persona{

	private String Apellido;

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public Cliente(int id, String nombre, String apellido) {
		super(id, nombre);
		Apellido = apellido;
	}

	public Cliente() {
		super();
	}

	
	
}
