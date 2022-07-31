package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Formacion;
import java.util.List;


public interface IFormacionService {
    
    public List<Formacion> getFormaciones();
    
    public void saveFormacion (Formacion exp, Long persona_id);
    
    public void deleteFormacion (Long id);
    
    public Formacion getFormacion (Long id);
    
    public List<Formacion> getFormacionByPersonaId (Long persona_id);
    
}
