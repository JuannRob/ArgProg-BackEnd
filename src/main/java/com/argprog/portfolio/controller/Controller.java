package com.argprog.portfolio.controller;


import com.argprog.portfolio.model.Persona;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    List<Persona> personasList = new ArrayList();
    
    @PostMapping ("/new/persona")
    public void postPersona (@RequestBody Persona persona) {
        personasList.add(persona);
    }
    
    @GetMapping ("/get/personas")
    @ResponseBody
    public List<Persona> getPersonas () {
        return personasList;
    }
    
}