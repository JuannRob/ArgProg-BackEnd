package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Link;
import com.argprog.portfolio.model.Persona;
import com.argprog.portfolio.repository.LinkRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkService implements ILinkService{

    @Autowired
    private LinkRepository linkRepo;

    @Autowired
    private IPersonaService persoServ;
    
    
    @Override
    public List<Link> getLinks() {
        return linkRepo.findAll();
    }

    @Override
    public void saveLink(Link link, Long persona_id) {
        Persona persona = persoServ.getPersona(persona_id);
        link.setPersona(persona);
        linkRepo.save(link);   
    }

    @Override
    public void deleteLink(Long id) {
        linkRepo.deleteById(id);
    }

    @Override
    public Link getLink(Long id) {
        return linkRepo.findById(id).orElse(null);
    }

    @Override
    public List<Link> getLinkByPersonaId(Long persona_id) {
        return linkRepo.findByPersona_Id(persona_id);
    }
    
}
