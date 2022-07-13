package com.argprog.portfolio.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="provincia")
public @Data
class Provincia {
    
    @Id
    private Long id;
    
    @Column(name="provincia")
    private String nombre;
    
    @OneToMany(mappedBy = "provincia")
    private List<Localidad> localidades = new ArrayList<>();
    
}
