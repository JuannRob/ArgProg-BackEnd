package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Idioma;
import com.argprog.portfolio.model.Nivel;
import com.argprog.portfolio.model.Persona;
import com.argprog.portfolio.model.Persona_Idioma_Nivel;
import com.argprog.portfolio.repository.Persona_Idioma_NivelRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Persona_Idioma_NivelService implements IPersona_Idioma_NivelService{
    
    @Autowired
    public Persona_Idioma_NivelRepository idiomaNivelRepo;

    @Autowired
    public IPersonaService persoServ;

    @Autowired
    public IIdiomaService idiomaServ;
    
    @Autowired
    public INivelService nivelServ;
    
    @Override
    public List<Persona_Idioma_Nivel> getIdiomasAndNiveles() {
        return idiomaNivelRepo.findAll();
    }

    @Override
    public void saveIdiomaAndNivel(Persona_Idioma_Nivel idiomaNivel, Long persona_id, Long idioma_id, Long nivel_id) {
        Persona persona = persoServ.getPersona(persona_id);
        Idioma idioma = idiomaServ.getIdioma(idioma_id);
        Nivel nivel = nivelServ.getNivel(nivel_id);
        
        idiomaNivel.setPersona(persona);
        idiomaNivel.setIdioma(idioma);
        idiomaNivel.setNivel(nivel);
        
        idiomaNivelRepo.save(idiomaNivel);
    }

    @Override
    public void deleteIdiomaAndNivel(Long id) {
        idiomaNivelRepo.deleteById(id);
    }

    @Override
    public Persona_Idioma_Nivel getIdiomaAndNivel(Long id) {
        return idiomaNivelRepo.findById(id).orElse(null);
    }

    @Override
    public List<Persona_Idioma_Nivel> getIdiomaAndNivelByPersonaId(Long persona_id) {
        return idiomaNivelRepo.findByPersona_Id(persona_id);
    }
    
}
