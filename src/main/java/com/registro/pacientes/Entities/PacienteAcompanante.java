package com.registro.pacientes.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "tb_paciente_acompanante")
@Data
public class PacienteAcompanante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_paciente_acompanante;
    private int id_paciente;
    private int id_tipo_docide;
    private String no_docide;
    private String no_apepat;
    private String no_apemat;
    private String no_nombres;
    private Date fe_nacimiento;
    private int id_parentesco;
    private String nu_telefo_contacto;
    private String no_direccion;
    private String co_ubigeo;
}
