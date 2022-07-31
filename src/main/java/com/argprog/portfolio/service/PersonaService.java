package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Localidad;
import com.argprog.portfolio.model.Persona;
import com.argprog.portfolio.model.Rol;
import com.argprog.portfolio.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    public PersonaRepository persoRepo;
    
    @Autowired
    private IRolService rolServ;
    
    @Autowired
    private ILocalidadService locServ;

    @Override
    public List<Persona> getPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void savePersona(Persona pers) {
        persoRepo.save(pers);
    }
    
    @Override
    public void changeRol(Long pers_id, Long id) {
        
        Persona pers = persoRepo.findById(pers_id).orElse(null);
        Rol rol = rolServ.getRol(id);
        pers.setRol(rol); 
        
        persoRepo.save(pers);
    }
    
    @Override
    public void changeLocalidad(Long pers_id, Long id) {
        
        Persona pers = persoRepo.findById(pers_id).orElse(null);
        Localidad loc = locServ.getLocalidad(id);
        pers.setLocalidad(loc); 
        
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
