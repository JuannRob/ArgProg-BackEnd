package com.argprog.portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "nivel")
public @Data        
class Nivel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;
    
    private String titulo;
    
    @OneToOne(mappedBy = "nivel", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private Competencia competencia;
}
