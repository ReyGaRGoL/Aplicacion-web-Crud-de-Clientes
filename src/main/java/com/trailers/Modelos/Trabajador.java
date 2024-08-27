package com.trailers.Modelos;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "idper")
public class Trabajador extends Persona{

	private String numero;

	

	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public Trabajador(int id, String nombre, String numero) {
		super(id, nombre);
		this.numero = numero;
	}



	public Trabajador() {
		super();
	}

	
}
