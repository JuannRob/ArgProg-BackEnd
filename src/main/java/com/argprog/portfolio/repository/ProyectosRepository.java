/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argprog.portfolio.repository;

import com.argprog.portfolio.model.Proyectos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Long>{
    
    List<Proyectos> findByPersona_Id(Long persona_id);
    
}
