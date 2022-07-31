/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Idioma;
import com.argprog.portfolio.repository.IdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomaService implements IIdiomaService{
    
    @Autowired
    public IdiomaRepository idiomaRepo;

    @Override
    public List<Idioma> getIdiomas() {
        return idiomaRepo.findAll();
    }

    @Override
    public Idioma getIdioma(Long id) {
        return idiomaRepo.findById(id).orElse(null);
    }
    
}
