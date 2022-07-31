package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Nivel;
import com.argprog.portfolio.repository.NivelRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NivelService implements INivelService{

    @Autowired
    public NivelRepository nivelRepo;
    
    @Override
    public Nivel getNivel(Long id) {
        return nivelRepo.findById(id).orElse(null);
    }
    
    @Override
    public List<Nivel> getNiveles(){
        return nivelRepo.findAll();
    }
    
}
