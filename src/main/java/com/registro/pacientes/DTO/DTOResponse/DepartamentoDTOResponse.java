package com.registro.pacientes.DTO.DTOResponse;

import lombok.Data;

@Data
public class DepartamentoDTOResponse {
    private String codigo_departamento;
    private String descripcion_departamento;

    public DepartamentoDTOResponse(String codigo_departamento, String descripcion_departamento){
        this.codigo_departamento = codigo_departamento;
        this.descripcion_departamento = descripcion_departamento;
    }
}
