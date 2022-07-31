package com.argprog.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "rol")
public @Data
class Rol {
    
    @Id
    private Long id;
    
    private String titulo;
    
}
