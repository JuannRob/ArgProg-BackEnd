package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Link;
import java.util.List;


public interface ILinkService {
    
    public List<Link> getLinks();
    
    public void saveLink (Link link, Long persona_id);
    
    public void deleteLink (Long id);
    
    public Link getLink (Long id);
    
    public List<Link> getLinkByPersonaId (Long persona_id);
    
}
