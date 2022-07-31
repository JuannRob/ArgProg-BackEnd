package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Competencia;
import java.util.List;


public interface ICompetenciaService {
    
    public List<Competencia> getCompetencias();
    
    public void saveCompetencia (Competencia comp, Long nivel_id, Long persona_id);
    
    public void deleteCompetencia (Long id);
    
    public Competencia getCompetencia (Long id);
    
    public List<Competencia> getCompetenciaByPersonaId (Long persona_id);
    
}
