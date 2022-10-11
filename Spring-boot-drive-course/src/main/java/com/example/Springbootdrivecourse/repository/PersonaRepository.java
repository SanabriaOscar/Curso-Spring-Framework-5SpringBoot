package com.example.Springbootdrivecourse.repository;

import com.example.Springbootdrivecourse.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
