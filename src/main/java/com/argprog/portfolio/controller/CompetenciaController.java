package com.argprog.portfolio.controller;

import com.argprog.portfolio.model.Competencia;
import com.argprog.portfolio.service.ICompetenciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompetenciaController {
    
    @Autowired
    private ICompetenciaService compServ;
    
    @GetMapping("/competencias")
    @ResponseBody
    public List<Competencia> getCompetencias() {
        return compServ.getCompetencias();
    }
 
    @GetMapping("/competencias/{id}")
    @ResponseBody
    public Competencia getCompetencia (@PathVariable Long id) {
        return compServ.getCompetencia(id);
    }
    
    @GetMapping("/personas/{id}/competencias")
    @ResponseBody
    public List<Competencia> getCompetenciaByPersonaId (@PathVariable Long id){
        return compServ.getCompetenciaByPersonaId(id);
    }
    
    @PostMapping ("/personas/{id}/competencias")
    public void saveCompetencia (@RequestBody Competencia comp, @PathVariable Long id, @RequestParam Long nivel) {
        compServ.saveCompetencia(comp, nivel, id);
    }
    
    @DeleteMapping ("/competencias/{id}")
    public void deleteCompetencia (@PathVariable Long id){
        compServ.deleteCompetencia(id);
    }
}