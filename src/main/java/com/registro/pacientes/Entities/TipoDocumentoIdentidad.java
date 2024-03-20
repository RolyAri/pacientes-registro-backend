package com.registro.pacientes.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tc_tipo_documento_identidad")
@Data
public class TipoDocumentoIdentidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipo_documento_identidad;
    private String descripcion_tipo_documento_identidad;
    private String codigo_ieds;
    private boolean fl_estado;
}
