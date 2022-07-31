package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Provincia;
import com.argprog.portfolio.repository.ProvinciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaService implements IProvinciaService {
    
      @Autowired
    public ProvinciaRepository provRepo;

    @Override
    public List<Provincia> getProvincias() {
       return provRepo.findAll();
    }

    @Override
    public Provincia getProvincia(Long id) {
        return provRepo.findById(id).orElse(null);
    }
    
}
