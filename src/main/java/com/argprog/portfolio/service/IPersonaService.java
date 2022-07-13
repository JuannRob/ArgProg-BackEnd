package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> getPersonas();
    
    public void savePersona (Persona pers, Long rol_id);
    
    public void deletePersona (Long id);
    
    public Persona getPersona (Long id);
    
}
