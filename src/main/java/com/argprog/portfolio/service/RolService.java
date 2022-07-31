package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Rol;
import com.argprog.portfolio.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService implements IRolService{
    
    @Autowired
    public RolRepository rolRepo;

    @Override
    public Rol getRol(Long id) {
        return rolRepo.findById(id).orElse(null);
    }
    
}
