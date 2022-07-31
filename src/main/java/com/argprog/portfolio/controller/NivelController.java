/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.portfolio.controller;

import com.argprog.portfolio.model.Nivel;
import com.argprog.portfolio.service.INivelService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NivelController {
    
    @Autowired
    private INivelService nivelServ;
    
    @GetMapping ("/niveles")
    @ResponseBody
    public List<Nivel> getNiveles () {
        return nivelServ.getNiveles();
    }
    
    @GetMapping ("/niveles/{id}")
    @ResponseBody
    public Nivel getNivel (@PathVariable Long id) {
        return nivelServ.getNivel(id);
    }
    
}
