package com.registro.pacientes.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Table(name = "tb_paciente")
@Data
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_paciente;
    private int id_tipo_docide;
    private String no_docide;
    private String no_apepat;
    private String no_apemat;
    private String no_nombres;
    private int id_sexo;
    private Date fe_nacimiento;
    private String no_lugar_nacimiento;
    private String no_direccion;
    private String co_ubigeo;

}
