package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    
    public void crearPersona  (Persona pers);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id);
    
    
}
