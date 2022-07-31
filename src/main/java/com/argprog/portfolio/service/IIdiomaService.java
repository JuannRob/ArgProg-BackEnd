package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Idioma;
import java.util.List;


public interface IIdiomaService {
    
    public List<Idioma> getIdiomas();
    
    public Idioma getIdioma (Long id);
}
