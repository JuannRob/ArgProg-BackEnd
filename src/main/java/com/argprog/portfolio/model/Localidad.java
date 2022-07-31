package com.argprog.portfolio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "localidad")
public @Data
class Localidad {
    
    @Id
    private Long id;
    
    @Column(name = "localidad")
    private String nombre;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_localidad_provincia1_idx"), name = "provincia_id", referencedColumnName="id")
    @JsonBackReference
    private Provincia provincia;
}
