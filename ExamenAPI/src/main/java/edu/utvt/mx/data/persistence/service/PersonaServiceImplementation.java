package edu.utvt.mx.data.persistence.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.utvt.mx.data.persistence.entities.Persona;
import edu.utvt.mx.data.persistence.repositories.PersonaRepository;

import java.util.UUID;

@Service
public class PersonaServiceImplementation implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Optional<Persona> getPersonaById(UUID id) {
        return personaRepository.findById(id);
    }

    @Override
    public List<Persona> getPersonasByName(String name) {
        return personaRepository.findByName(name);
    }

    @Override
    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public void deletePersona(UUID id) {
        personaRepository.deleteById(id);
    }
}