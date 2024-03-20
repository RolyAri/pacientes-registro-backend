package com.registro.pacientes.Services;

import com.registro.pacientes.DAO.SexoRepository;
import com.registro.pacientes.Entities.Sexo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SexoService {
    @Autowired
    SexoRepository sexoRepository;
    public List<Sexo> listarSexos(){
        return sexoRepository.findAll();
    }
}
