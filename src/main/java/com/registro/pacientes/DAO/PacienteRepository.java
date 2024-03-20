package com.registro.pacientes.DAO;

import com.registro.pacientes.Entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

}
