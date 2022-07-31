/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Experiencia;
import com.argprog.portfolio.model.Persona;
import com.argprog.portfolio.repository.ExpRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpService implements IExpService {
    
    @Autowired
    public ExpRepository expRepo;
    
    @Autowired
    private IPersonaService persoServ;
    
    @Override
    public List<Experiencia> getExperiencias() {
        return expRepo.findAll();
    }

    @Override
    public void saveExperiencia (Experiencia exp, Long persona_id) {
        Persona persona = persoServ.getPersona(persona_id);
        exp.setPersona(persona);
        expRepo.save(exp);   
    }

    @Override
    public void deleteExperiencia(Long id) {
       expRepo.deleteById(id);
        
    }

    @Override
    public Experiencia getExperiencia(Long id) {
       return expRepo.findById(id).orElse(null);
    }
    
    @Override
    public List<Experiencia> getExperienciasByPersonaId (Long persona_id){
        return expRepo.findByPersona_Id(persona_id);
    }
    
}
