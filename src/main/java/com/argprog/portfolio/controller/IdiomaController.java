package com.argprog.portfolio.controller;

import com.argprog.portfolio.model.Idioma;
import com.argprog.portfolio.model.Persona_Idioma_Nivel;
import com.argprog.portfolio.service.IIdiomaService;
import com.argprog.portfolio.service.IPersona_Idioma_NivelService;
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
public class IdiomaController {
    
    @Autowired
    private IIdiomaService idiomaServ;
    
    @Autowired
    private IPersona_Idioma_NivelService persIdiomaServ;
    
    @GetMapping ("/idiomas")
    @ResponseBody
    public List<Idioma> getIdiomas () {
        return idiomaServ.getIdiomas();
    }
    
    @GetMapping ("/idiomas/{id}")
    @ResponseBody
    public Idioma getIdioma (@PathVariable Long id) {
        return idiomaServ.getIdioma(id);
    }
    
    @GetMapping ("/persIdiomas")
    @ResponseBody
    public List<Persona_Idioma_Nivel> getIdiomasAndNiveles () {
        return persIdiomaServ.getIdiomasAndNiveles();
    }
    
    @GetMapping ("/persIdiomas/{id}")
    @ResponseBody
    public Persona_Idioma_Nivel getIdiomaAndNivel (@PathVariable Long id) {
        return persIdiomaServ.getIdiomaAndNivel(id);
    }
    
    @GetMapping ("/personas/{id}/idiomas")
    @ResponseBody
    public List<Persona_Idioma_Nivel> getIdiomaAndNivelByPersonaId (@PathVariable Long id) {
        return persIdiomaServ.getIdiomaAndNivelByPersonaId(id);
    }
    
    @PostMapping ("/personas/{id}/idiomas")
    public void saveIdiomaAndNivel (@RequestBody Persona_Idioma_Nivel idiomaNivel, 
                                    @PathVariable Long id, @RequestParam Long idioma_id, 
                                    @RequestParam Long nivel_id) {
        persIdiomaServ.saveIdiomaAndNivel(idiomaNivel, id, idioma_id, nivel_id);
    }
    
    @DeleteMapping ("/persIdiomas/{id}")
    public void deleteIdiomaAndNivel (@PathVariable Long id) {
        persIdiomaServ.deleteIdiomaAndNivel(id);
    }
    
    
    
}
