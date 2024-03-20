package com.registro.pacientes.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tc_ubigeo")
@Data
public class Ubigeo {
    @Id
    private String codigo_ubigeo;
    private String codigo_departamento;
    private String codigo_provincia;
    private String codigo_distrito;
    private String descripcion_departamento;
    private String descripcion_provincia;
    private String descripcion_distrito;
    private boolean fl_estado;
}
