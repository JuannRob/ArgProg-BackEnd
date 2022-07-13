package com.argprog.portfolio.controller;

import com.argprog.portfolio.model.Persona;
import com.argprog.portfolio.service.IPersonaService;
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
public class PersonaController {
    
    @Autowired
    private IPersonaService persoServ;
    
    @GetMapping ("/personas")
    @ResponseBody
    public List<Persona> getPersonas () {
        return persoServ.getPersonas();
    }
    
    @GetMapping ("/personas/{id}")
    @ResponseBody
    public Persona getPersona (@PathVariable Long id) {
        return persoServ.getPersona(id);
    }
    
    @PostMapping ("/personas")
    public void savePersona (@RequestBody Persona persona,
                             @RequestParam Long rol) {
        persoServ.savePersona(persona, rol);
    }
    
    @DeleteMapping ("/personas/{id}")
    public void deletePersona (@PathVariable Long id) {
        persoServ.deletePersona(id); 
    }
    
}