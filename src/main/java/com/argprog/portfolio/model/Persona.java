package com.argprog.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String password;
    private String nombre;
    private String apellido;
    private String fecha_nac;
    private String domicilio;
    private Long localidad_id;
    private String telefono;
    private String url_foto;
    private String sobre_mi;
    private Long rol_id;

    public Persona() {
    }

    public Persona(Long id, String email, String password, String nombre, String apellido, String fecha_nac, String domicilio, Long localidad_id, String telefono, String url_foto, String sobre_mi, Long rol_id) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.domicilio = domicilio;
        this.localidad_id = localidad_id;
        this.telefono = telefono;
        this.url_foto = url_foto;
        this.sobre_mi = sobre_mi;
        this.rol_id = rol_id;
    }
    
    
}