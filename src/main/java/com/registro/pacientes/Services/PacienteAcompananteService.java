package com.registro.pacientes.Services;

import com.registro.pacientes.DAO.PacienteAcompananteRepository;
import com.registro.pacientes.Entities.PacienteAcompanante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteAcompananteService {
    @Autowired
    private PacienteAcompananteRepository pacienteAcompananteRepository;

    public List<PacienteAcompanante> listarPacienteAcompanantes(){
        return pacienteAcompananteRepository.findAll();
    }
}
