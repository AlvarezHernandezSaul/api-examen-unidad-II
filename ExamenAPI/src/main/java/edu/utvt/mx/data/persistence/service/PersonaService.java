package edu.utvt.mx.data.persistence.service;


import java.util.List;
import java.util.Optional;

import edu.utvt.mx.data.persistence.entities.Persona;

public interface PersonaService {
    List<Persona> getAllPersonas();
    
    Optional<Persona> getPersonaById(Long id);
    
    List<Persona> getPersonasByName(String name);
    
    Persona savePersona(Persona persona);
    
    void deletePersona(Long id);
}
