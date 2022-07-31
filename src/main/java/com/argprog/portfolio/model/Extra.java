/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
@Table(name="extra")
public @Data
class Extra {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descripcion;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_extra_persona1_idx"), name = "persona_id", referencedColumnName="id")
    @JsonIgnore
    private Persona persona;
}
