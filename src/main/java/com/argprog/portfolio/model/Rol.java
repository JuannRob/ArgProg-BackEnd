package com.argprog.portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "rol")
public @Data
class Rol {
    
    @Id
    @JsonIgnore
    private Long id;
    
    private String titulo;
    
}
