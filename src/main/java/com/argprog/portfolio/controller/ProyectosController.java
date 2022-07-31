package com.argprog.portfolio.controller;

import com.argprog.portfolio.model.Proyectos;
import com.argprog.portfolio.service.IProyectosService;
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
public class ProyectosController {
    
    @Autowired
    private IProyectosService proyServ;
    
    @GetMapping ("/proyectos")
    @ResponseBody
    public List<Proyectos> getProyectos () {
        return proyServ.getProyectos();
    }
    
    @GetMapping ("/proyectos/{id}")
    @ResponseBody
    public Proyectos getProyecto (@PathVariable Long id) {
        return proyServ.getProyecto(id);
    }
    
    @GetMapping ("/personas/{id}/proyectos")
    @ResponseBody
    public List<Proyectos> getProyectosByPersonaId (@PathVariable Long id) {
        return proyServ.getProyectosByPersonaId(id);
    }
    
    @PostMapping ("/personas/{id}/proyectos")
    public void saveProyecto (@RequestBody Proyectos proy, @PathVariable Long id) {
        proyServ.saveProyecto(proy, id);
    }
    
    @DeleteMapping ("/proyectos/{id}")
    public void deleteProyecto (@PathVariable Long id) {
        proyServ.deleteProyecto(id);
    }
    
}
