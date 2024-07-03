package edu.utvt.mx.data.persistence.service;


import java.util.List;
import java.util.Optional;

import edu.utvt.mx.data.persistence.entities.Persona;
import java.util.UUID;

public interface PersonaService {
	
	 List<Persona> getAllPersonas();
	 
	    Optional<Persona> getPersonaById(UUID id);
	    
	    List<Persona> getPersonasByNombre(String nombre);
	    
	    Persona savePersona(Persona persona);
	    
	    void deletePersona(UUID id);
}
