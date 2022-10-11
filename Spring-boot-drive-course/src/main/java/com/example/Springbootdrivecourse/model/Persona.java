package com.example.Springbootdrivecourse.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "persona")
public class Persona implements Serializable {

    private  static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idPersona;
    private  String nombre;
    private  String apellido;
    private  String telefono;
    private  String email;

}
