package com.argprog.portfolio.controller;

import com.argprog.portfolio.model.Formacion;
import com.argprog.portfolio.service.IFormacionService;
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
public class FormacionController {
    
    @Autowired
    private IFormacionService formaServ;
 
    @GetMapping ("/formaciones")
    @ResponseBody
    public List<Formacion> getFormaciones () {
        return formaServ.getFormaciones();
    }
    
    @GetMapping ("/formaciones/{id}")
    @ResponseBody
    public Formacion getFormacion (@PathVariable Long id) {
        return formaServ.getFormacion(id);
    }
    
    @GetMapping ("/personas/{id}/formaciones")
    @ResponseBody
    public List<Formacion> getFormacionByPersonaId (@PathVariable Long id) {
        return formaServ.getFormacionByPersonaId(id);
    }
    
    @PostMapping ("/personas/{id}/formaciones")
    public void saveFormacion (@RequestBody Formacion forma, @PathVariable Long id) {
        formaServ.saveFormacion(forma, id);
    }
    
    @DeleteMapping ("/formaciones/{id}")
    public void deleteFormacion (@PathVariable Long id) {
        formaServ.deleteFormacion(id);
    }
}
