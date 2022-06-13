package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Persona;
import com.argprog.portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Persona> getPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void savePersona(Persona pers) {
        persoRepo.save(pers);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona getPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
}
