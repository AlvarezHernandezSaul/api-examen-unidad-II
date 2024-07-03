package edu.utvt.mx.data.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.utvt.mx.data.persistence.entities.Persona;

import java.util.List;
import java.util.UUID;

public interface PersonaRepository extends JpaRepository<Persona, UUID> {
    List<Persona> findByNombre(String nombre);
}