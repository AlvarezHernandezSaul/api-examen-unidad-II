package edu.utvt.mx.data.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.utvt.mx.data.persistence.entities.Persona;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    List<Persona> findByName(String name);
}