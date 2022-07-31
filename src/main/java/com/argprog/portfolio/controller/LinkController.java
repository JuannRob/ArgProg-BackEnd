package com.argprog.portfolio.controller;

import com.argprog.portfolio.model.Link;
import com.argprog.portfolio.service.ILinkService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinkController {
    
    @Autowired
    private ILinkService linkServ;
    
    @GetMapping ("/links")
    @ResponseBody
    public List<Link> getLinks () {
        return linkServ.getLinks();
    }
    
    @GetMapping ("/links/{id}")
    @ResponseBody
    public Link getLink (@PathVariable Long id) {
        return linkServ.getLink(id);
    }
    
    @GetMapping ("/personas/{id}/links")
    @ResponseBody
    public List<Link> getLinkByPersonaId (@PathVariable Long id) {
        return linkServ.getLinkByPersonaId(id);
    }
    
    @PostMapping ("/personas/{id}/links")
    public void saveLink (@RequestBody Link link, @PathVariable Long id) {
        linkServ.saveLink(link, id);
    }
    
    @DeleteMapping ("/links/{id}")
    public void deleteLink (@PathVariable Long id) {
        linkServ.deleteLink(id);
    }
    
}
