package com.registro.pacientes.DAO;

import com.registro.pacientes.Entities.PacienteAcompanante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteAcompananteRepository extends JpaRepository<PacienteAcompanante, Integer> {
}
