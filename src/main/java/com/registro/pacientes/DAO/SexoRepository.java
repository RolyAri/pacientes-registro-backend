package com.registro.pacientes.DAO;

import com.registro.pacientes.Entities.Sexo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SexoRepository extends JpaRepository<Sexo, Integer> {
}
