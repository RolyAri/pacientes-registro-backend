package com.registro.pacientes.RestController;

import com.registro.pacientes.Entities.PacienteAcompanante;
import com.registro.pacientes.Services.PacienteAcompananteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/paciente-acompanante")
@CrossOrigin("*")
public class PacienteAcompananteController {
    @Autowired
    private PacienteAcompananteService pacienteAcompananteService;

    @GetMapping("/listar")
    public List<PacienteAcompanante> listarPacienteAcompanantes(){
        return pacienteAcompananteService.listarPacienteAcompanantes();
    }
}
