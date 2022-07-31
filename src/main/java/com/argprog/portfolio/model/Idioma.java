package com.argprog.portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="idioma")
public @Data
class Idioma {
    
    @Id
    @JsonIgnore
    private Long id;
    private String codigo;
    private String idioma;
    
}
