package com.example.Springbootdrivecourse.service;

import com.example.Springbootdrivecourse.model.Persona;

import java.util.List;

public interface IPersonaService {
    public List<Persona>listarPersonas();
    public void guardarPersona(Persona persona);
    public Persona buscarPorId(Persona persona);
    public void  eliminarPersona(Persona persona);

}
