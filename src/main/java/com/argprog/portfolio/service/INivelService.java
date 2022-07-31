package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Nivel;
import java.util.List;

public interface INivelService {
    
    public Nivel getNivel (Long id);
    
    public List<Nivel> getNiveles();
}
