package com.argprog.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "nivel")
public @Data        
class Nivel {
    
    @Id
    private Long id;
    private String titulo;
}
