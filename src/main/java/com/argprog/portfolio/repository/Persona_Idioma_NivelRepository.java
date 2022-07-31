/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argprog.portfolio.repository;

import com.argprog.portfolio.model.Persona_Idioma_Nivel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Persona_Idioma_NivelRepository extends JpaRepository<Persona_Idioma_Nivel, Long>{
 
    List<Persona_Idioma_Nivel> findByPersona_Id(Long persona_id);
    
}
