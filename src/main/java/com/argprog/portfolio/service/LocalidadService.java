package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Localidad;
import com.argprog.portfolio.repository.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadService implements ILocalidadService{
    
    @Autowired
    public LocalidadRepository locRepo;

    @Override
    public Localidad getLocalidad(Long id) {
        return locRepo.findById(id).orElse(null);
    }
    
}
