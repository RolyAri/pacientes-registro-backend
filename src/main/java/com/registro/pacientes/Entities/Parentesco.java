package com.registro.pacientes.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tc_parentesco")
@Data
public class Parentesco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_parentesco;
    private String no_parentesco;
    private boolean il_activo;
}
