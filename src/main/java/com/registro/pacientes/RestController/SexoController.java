package com.registro.pacientes.RestController;

import com.registro.pacientes.Entities.Sexo;
import com.registro.pacientes.Services.SexoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sexo")
@CrossOrigin("*")
public class SexoController {
    @Autowired
    private SexoService sexoService;
    @GetMapping("/listar")
    public List<Sexo> listarSexos(){
        return sexoService.listarSexos();
    }
}
