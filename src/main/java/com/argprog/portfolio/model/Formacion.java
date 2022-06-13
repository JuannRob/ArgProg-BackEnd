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
@Table(name = "formacion")
public @Data
class Formacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String institucion;
    private String titulo;
    private String descripcion;
    private String fecha_inicio;
    private String fecha_fin;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_formacion_persona1_idx"), name = "persona_id", referencedColumnName="id")
    @JsonIgnore
    private Persona persona;
    
}