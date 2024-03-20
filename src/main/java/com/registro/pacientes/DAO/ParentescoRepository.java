package com.registro.pacientes.DAO;

import com.registro.pacientes.Entities.Parentesco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentescoRepository extends JpaRepository<Parentesco, Integer> {
}
