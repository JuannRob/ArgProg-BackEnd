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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    
        @PostMapping ("/persona/save")
    public void postPersona (@RequestBody Persona persona) {
        persoServ.crearPersona(persona);
    }
    
    @GetMapping ("/persona/get")
    @ResponseBody
    public List<Persona> getPersonas () {
        return persoServ.verPersonas();
    }
    
    @GetMapping ("/persona/get/{id}")
    @ResponseBody
    public Persona getPersona (@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    }
    
    @DeleteMapping ("/persona/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
        persoServ.borrarPersona(id); 
    }
    
}