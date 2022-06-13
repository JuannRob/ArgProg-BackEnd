package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Formacion;
import com.argprog.portfolio.model.Persona;
import com.argprog.portfolio.repository.FormacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormacionService implements IFormacionService{
    
    @Autowired
    public FormacionRepository formaRepo;
    
    @Autowired
    private IPersonaService persoServ;

    @Override
    public List<Formacion> getFormaciones() {
        return formaRepo.findAll();
    }

    @Override
    public void saveFormacion(Formacion exp, Long persona_id) {
        Persona persona = persoServ.getPersona(persona_id);
        exp.setPersona(persona);
        formaRepo.save(exp);
    }

    @Override
    public void deleteFormacion(Long id) {
        formaRepo.deleteById(id);
    }

    @Override
    public Formacion getFormacion(Long id) {
        return formaRepo.findById(id).orElse(null);
    }

    @Override
    public List<Formacion> getFormacionbyPersonaId(Long persona_id) {
        return formaRepo.findByPersona_Id(persona_id);
    }
    
}
