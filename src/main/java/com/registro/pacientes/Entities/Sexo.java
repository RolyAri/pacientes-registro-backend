package com.registro.pacientes.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tc_sexo")
@Data
public class Sexo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sexo;
    private String descripcion_sexo;
    private boolean fl_estado;
}
