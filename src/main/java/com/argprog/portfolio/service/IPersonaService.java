package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> getPersonas();
    
    public void savePersona (Persona pers);
    
    public void deletePersona (Long id);
    
    public Persona getPersona (Long id);
    
    public void changeRol (Long pers_id, Long id);
    
    public void changeLocalidad (Long pers_id, Long id);
    
}
