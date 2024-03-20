package com.registro.pacientes.RestController;

import com.registro.pacientes.Entities.Parentesco;
import com.registro.pacientes.Services.ParentescoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parentesco")
@CrossOrigin("*")
public class ParentescoController {
    @Autowired
    private ParentescoService parentescoService;

    @GetMapping("/listar")
    public List<Parentesco> listarParentescos(){
        return parentescoService.listarParentescos();
    }
}
