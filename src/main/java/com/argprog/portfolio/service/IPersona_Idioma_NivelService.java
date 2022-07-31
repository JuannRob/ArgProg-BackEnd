package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Persona_Idioma_Nivel;
import java.util.List;

public interface IPersona_Idioma_NivelService {
    
    public List<Persona_Idioma_Nivel> getIdiomasAndNiveles();
    
    public void saveIdiomaAndNivel (Persona_Idioma_Nivel idiomaNivel, Long persona_id, 
                                       Long idioma_id, Long nivel_id);
    
    public void deleteIdiomaAndNivel (Long id);
    
    public Persona_Idioma_Nivel getIdiomaAndNivel (Long id);
    
    public List<Persona_Idioma_Nivel> getIdiomaAndNivelByPersonaId (Long persona_id);
    
    
}
