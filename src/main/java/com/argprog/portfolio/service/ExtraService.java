package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Extra;
import com.argprog.portfolio.model.Persona;
import com.argprog.portfolio.repository.ExtraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExtraService implements IExtraService{
    
    @Autowired
    private ExtraRepository extraRepo;

    @Autowired
    private IPersonaService persoServ;
    
    @Override
    public List<Extra> getExtras() {
        return extraRepo.findAll();
    }

    @Override
    public void saveExtra(Extra extra, Long persona_id) {
        Persona persona = persoServ.getPersona(persona_id);
        extra.setPersona(persona);
        extraRepo.save(extra);   
    }

    @Override
    public void deleteExtra(Long id) {
        extraRepo.deleteById(id);
    }

    @Override
    public Extra getExtra(Long id) {
        return extraRepo.findById(id).orElse(null);
    }

    @Override
    public List<Extra> getExtraByPersonaId(Long persona_id) {
        return extraRepo.findByPersona_Id(persona_id);
    }
    
}
