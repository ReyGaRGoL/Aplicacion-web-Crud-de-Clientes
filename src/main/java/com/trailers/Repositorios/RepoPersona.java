package com.trailers.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trailers.Modelos.Persona;

@Repository
public interface RepoPersona extends JpaRepository<Persona, Integer>{

}
