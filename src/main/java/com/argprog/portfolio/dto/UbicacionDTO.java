package com.argprog.portfolio.dto;
import java.io.Serializable;
import lombok.Data;

public @Data 
class UbicacionDTO implements Serializable {
    
    private String localidad;
    private String provincia; 
}
