/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Persona;
import com.argprog.portfolio.model.Proyectos;
import com.argprog.portfolio.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {
    
    @Autowired
    private ProyectosRepository proyRepo;
    
    @Autowired
    private IPersonaService persoServ;

    @Override
    public List<Proyectos> getProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public void saveProyecto(Proyectos proyecto, Long persona_id) {
        Persona persona = persoServ.getPersona(persona_id);
        proyecto.setPersona(persona);
        proyRepo.save(proyecto);   
    }

    @Override
    public void deleteProyecto(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyectos getProyecto(Long id) {
        return proyRepo.findById(id).orElse(null);
    }

    @Override
    public List<Proyectos> getProyectosByPersonaId(Long persona_id) {
        return proyRepo.findByPersona_Id(persona_id);
    }
    
}
