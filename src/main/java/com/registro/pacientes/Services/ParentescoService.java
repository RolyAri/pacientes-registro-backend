package com.registro.pacientes.Services;

import com.registro.pacientes.DAO.ParentescoRepository;
import com.registro.pacientes.Entities.Parentesco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentescoService {
    @Autowired
    private ParentescoRepository parentescoRepository;

    public List<Parentesco> listarParentescos(){
        return parentescoRepository.findAll();
    }
}
