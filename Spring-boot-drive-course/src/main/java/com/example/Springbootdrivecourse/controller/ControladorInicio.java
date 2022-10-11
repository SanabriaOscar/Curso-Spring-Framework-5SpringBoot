package com.example.Springbootdrivecourse.controller;

import com.example.Springbootdrivecourse.model.Persona;
import com.example.Springbootdrivecourse.repository.PersonaRepository;
import com.example.Springbootdrivecourse.service.PersonaServiceImpl;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PersonaServiceImpl personaService;
    @GetMapping("/")
    public String inicio(Model model){
        var personas=personaService.listarPersonas();
        model.addAttribute("personas", personas);
        log.info("ejecutndo el controlador");
        return "index";

    }
    @GetMapping("/agregar")
    public String agregarPersona(Persona persona){

        return "modificar";

    }
    @PostMapping("/guardar")
    public String guardarPersona(Persona persona){
        personaService.guardarPersona(persona);
        return "redirect:/";
    }
    @GetMapping("/editar/{idPersona}")
    public String editarPersona(Persona persona, Model model){
        persona= personaService.buscarPorId(persona);
        model.addAttribute("persona", persona);
        return "modificar";

    }
    @GetMapping("/eliminar/{idPersona}")
    public String eliminarPersona(Persona persona){
       personaService.eliminarPersona(persona);
        return "redirect:/";

    }

}
