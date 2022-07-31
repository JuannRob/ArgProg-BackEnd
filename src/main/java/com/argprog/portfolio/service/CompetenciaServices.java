package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Competencia;
import com.argprog.portfolio.model.Nivel;
import com.argprog.portfolio.model.Persona;
import com.argprog.portfolio.repository.CompetenciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompetenciaServices implements ICompetenciaService{
    
    @Autowired
    public CompetenciaRepository compRepo;
    
    @Autowired
    private IPersonaService persoServ;
            
    @Autowired
    private INivelService nivelServ;
    
    @Override
    public List<Competencia> getCompetencias() {
        return compRepo.findAll();
    }

    @Override
    public void saveCompetencia(Competencia comp, Long nivel_id, Long persona_id) {
        Persona persona = persoServ.getPersona(persona_id);
        Nivel nivel = nivelServ.getNivel(nivel_id);
        comp.setPersona(persona);
        comp.setNivel(nivel);
        compRepo.save(comp);
    }

    @Override
    public void deleteCompetencia(Long id) {
        compRepo.deleteById(id);
    }

    @Override
    public Competencia getCompetencia(Long id) {
        return compRepo.findById(id).orElse(null);
    }

    @Override
    public List<Competencia> getCompetenciaByPersonaId(Long persona_id) {
        return compRepo.findByPersona_Id(persona_id);
    }
    
}
