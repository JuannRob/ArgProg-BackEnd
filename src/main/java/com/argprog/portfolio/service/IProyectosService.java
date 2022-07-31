package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    
    public List<Proyectos> getProyectos();
    
    public void saveProyecto (Proyectos proyecto, Long persona_id);
    
    public void deleteProyecto (Long id);
    
    public Proyectos getProyecto (Long id);
    
    public List<Proyectos> getProyectosByPersonaId (Long persona_id);
    
}
