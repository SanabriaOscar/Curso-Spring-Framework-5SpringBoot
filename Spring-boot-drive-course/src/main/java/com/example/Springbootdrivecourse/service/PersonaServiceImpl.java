package com.example.Springbootdrivecourse.service;

import com.example.Springbootdrivecourse.model.Persona;
import com.example.Springbootdrivecourse.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class PersonaServiceImpl implements IPersonaService{
    @Autowired
    private PersonaRepository personaRepository;
    @Override
    @Transactional()
    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }

    @Override
    @Transactional
    public void guardarPersona(Persona persona) {personaRepository.save(persona);
    }

    @Override
    @Transactional
    public Persona buscarPorId(Persona persona) {
        return personaRepository.findById(persona.getIdPersona()).orElse(null);
    }

    @Override
    @Transactional
    public void eliminarPersona(Persona persona) {
        personaRepository.delete(persona);
    }
}
