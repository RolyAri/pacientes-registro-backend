package com.registro.pacientes.DTO.DTOResponse;

import lombok.Data;

@Data
public class DistritoDTOResponse {
    private String codigo_distrito;
    private String descripcion_distrito;

    public DistritoDTOResponse(String codigo_distrito, String descripcion_distrito){
        this.codigo_distrito = codigo_distrito;
        this.descripcion_distrito = descripcion_distrito;
    }
}
