package edu.utvt.mx.data.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.utvt.mx.data.persistence.entities.Persona;
import edu.utvt.mx.data.persistence.service.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public List<Persona> getAllPersonas() {
        return personaService.getAllPersonas();
    }

    @GetMapping("/{id}")
    public Persona getPersonaById(@PathVariable UUID id) {
        return personaService.getPersonaById(id).orElse(null);
    }

    @GetMapping("/nombre/{nombre}")
    public List<Persona> getPersonasByNombre(@PathVariable String nombre) {
        return personaService.getPersonasByNombre(nombre);
    }

    @PostMapping
    public Persona createPersona(@RequestBody Persona persona) {
        return personaService.savePersona(persona);
    }

    @PutMapping("/{id}")
    public Persona updatePersona(@PathVariable UUID id, @RequestBody Persona personaDetails) {
        Persona persona = personaService.getPersonaById(id).orElse(null);
        if (persona != null) {
            persona.setNombre(personaDetails.getNombre());
            persona.setEdad(personaDetails.getEdad());
            persona.setFechaNacimiento(personaDetails.getFechaNacimiento());
            return personaService.savePersona(persona);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePersona(@PathVariable UUID id) {
        personaService.deletePersona(id);
    }
}