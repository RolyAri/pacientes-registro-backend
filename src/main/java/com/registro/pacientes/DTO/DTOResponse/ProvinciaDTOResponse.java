package com.registro.pacientes.DTO.DTOResponse;

import lombok.Data;

@Data
public class ProvinciaDTOResponse {
    private String codigo_provincia;
    private String descripcion_provincia;

    public ProvinciaDTOResponse(String codigo_provincia, String descripcion_provincia){
        this.codigo_provincia = codigo_provincia;
        this.descripcion_provincia = descripcion_provincia;
    }
}
