package com.argprog.portfolio.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "persona")
public @Data
class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;
    private String nombre;
    private String apellido;
    private String fecha_nac;
    private String domicilio;
    private String telefono;
    private String url_foto;
    private String sobre_mi;
    
    @OneToOne
    @JoinColumn(name = "localidad_id", referencedColumnName = "id")
    private Localidad localidad;
    
    @OneToOne
    @JoinColumn(name = "rol_id", referencedColumnName = "id")
    private Rol rol;
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Experiencia> experiencias = new ArrayList<>();
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Formacion> formaciones = new ArrayList<>();

    @OneToMany(mappedBy = "persona", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Competencia> competencias = new ArrayList<>();
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Extra> extras = new ArrayList<>();
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Link> links = new ArrayList<>();
    
    
}