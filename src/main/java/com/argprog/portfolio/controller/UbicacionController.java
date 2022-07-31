package com.argprog.portfolio.controller;

import com.argprog.portfolio.dto.UbicacionDTO;
import com.argprog.portfolio.model.Localidad;
import com.argprog.portfolio.model.Persona;
import com.argprog.portfolio.model.Provincia;
import com.argprog.portfolio.service.ILocalidadService;
import com.argprog.portfolio.service.IPersonaService;
import com.argprog.portfolio.service.IProvinciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UbicacionController {
    
    @Autowired
    private IPersonaService persoServ;
    
    @Autowired
    private IProvinciaService provServ;
    
    @Autowired
    private ILocalidadService locServ;
    
    @GetMapping ("/personas/{id}/ubicacion")
    @ResponseBody
    public UbicacionDTO getUbicacionByPersonaId (@PathVariable Long id){
        
        Persona persona = persoServ.getPersona(id);
        Localidad localidad = persona.getLocalidad();
        Provincia provincia = localidad.getProvincia();
        
        UbicacionDTO ubiDTO = new UbicacionDTO();
        
        ubiDTO.setLocalidad(localidad.getNombre());
        ubiDTO.setProvincia(provincia.getNombre());
        
        return ubiDTO;
    }
    
    @GetMapping ("/provincias")
    @ResponseBody
    public List<Provincia> getProvincias() {
        return provServ.getProvincias();
    }
    
    @GetMapping ("/provincias/{id}")
    @ResponseBody
    public Provincia getProvincia (@PathVariable Long id) {
        return provServ.getProvincia(id);
    }
    
    @GetMapping ("/localidades/{id}")
    @ResponseBody
    public Localidad getLocalidad (@PathVariable Long id) {
        return locServ.getLocalidad(id);
    }
    
    @GetMapping ("/provincias/{id}/localidades")
    @ResponseBody
    public List<Localidad> getLocalidadesOfProvincia (@PathVariable Long id) {
        Provincia prov = provServ.getProvincia(id);
        
        return prov.getLocalidades();
    }
    
    @PostMapping ("/personas/{id}/ubicacion")
    public void changeLocalidad (@PathVariable Long id,
                                 @RequestParam Long loc_id) {
        persoServ.changeLocalidad(id, loc_id);
    }
}
