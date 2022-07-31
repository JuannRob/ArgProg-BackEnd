package com.argprog.portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "persona_idioma_nivel")
public @Data
class Persona_Idioma_Nivel {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "idioma_id_idx"), name = "idioma_id", referencedColumnName="id")
    private Idioma idioma;
    
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "nivel_id_idx"), name = "nivel_id", referencedColumnName="id")
    private Nivel nivel;
        
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "persona_id_idx"), name = "persona_id", referencedColumnName="id")
    @JsonIgnore
    private Persona persona;
    
}
