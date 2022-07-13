package com.argprog.portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "nivel")
public @Data        
class Nivel {
    
    @Id
    @JsonIgnore
    private Long id;
    
    private String titulo;
}
