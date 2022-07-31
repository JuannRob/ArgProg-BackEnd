package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Provincia;
import java.util.List;

public interface IProvinciaService {
    
    public List<Provincia> getProvincias();
    
    public Provincia getProvincia (Long id);
    
}
