package com.trailers.Modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idper;
	
	private String nombre;

	public int getIdper() {
		return idper;
	}

	public void setIdper(int id) {
		this.idper = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona(int id, String nombre) {
		this.idper = id;
		this.nombre = nombre;
	}

	public Persona() {
	}
	
	
}
