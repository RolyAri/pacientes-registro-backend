package com.registro.pacientes.Services;

import com.registro.pacientes.DAO.PacienteRepository;
import com.registro.pacientes.Entities.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente registrarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }
    public List<Paciente> listarPacientes(){
        return pacienteRepository.findAll();
    }
    public Paciente obtenerPorId(int id){
        return pacienteRepository.findById(id).orElse(null);
    }
    public Paciente actualizarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }
    public void eliminarCliente(int id){
        pacienteRepository.deleteById(id);
    }
}
