package com.argprog.portfolio.controller;

import com.argprog.portfolio.model.Experiencia;
import com.argprog.portfolio.service.IExpService;
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
public class ExpController {
    
    @Autowired
    private IExpService expServ;
    
    @GetMapping ("/experiencias")
    @ResponseBody
    public List<Experiencia> getExperiencias () {
        return expServ.getExperiencias();
    }
    
    @GetMapping ("/experiencias/{id}")
    @ResponseBody
    public Experiencia getExperiencia (@PathVariable Long id) {
        return expServ.getExperiencia(id);
    }
    
    @GetMapping ("/personas/{id}/experiencias")
    @ResponseBody
    public List<Experiencia> getExperienciabyPersonaId (@PathVariable Long id) {
        return expServ.getExperienciasbyPersonaId(id);
    }
    
    @PostMapping ("/personas/{id}/experiencias")
    public void saveExperiencia (@RequestBody Experiencia exp, @PathVariable Long id) {
        expServ.saveExperiencia(exp, id);
    }
    
    @DeleteMapping ("/experiencias/{id}")
    public void deleteExperiencia (@PathVariable Long id) {
        expServ.deleteExperiencia(id);
    }
    
    
}
