package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Experiencia;
import java.util.List;


public interface IExpService {
    
    public List<Experiencia> getExperiencias();
    
    public void saveExperiencia (Experiencia exp, Long persona_id);
    
    public void deleteExperiencia (Long id);
    
    public Experiencia getExperiencia (Long id);
    
    public List<Experiencia> getExperienciasbyPersonaId (Long persona_id);
    
}
