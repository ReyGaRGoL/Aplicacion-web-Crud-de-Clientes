package com.trailers.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trailers.Modelos.Persona;
import com.trailers.Modelos.Trabajador;

@Repository
public interface RepoTrabajador extends JpaRepository<Trabajador, Integer>{

}
