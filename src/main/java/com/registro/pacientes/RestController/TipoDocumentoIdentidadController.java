package com.registro.pacientes.RestController;

import com.registro.pacientes.Entities.TipoDocumentoIdentidad;
import com.registro.pacientes.Services.TipoDocumentoIdentidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipo-documento-identidad")
@CrossOrigin("*")
public class TipoDocumentoIdentidadController {
    @Autowired
    private TipoDocumentoIdentidadService tipoDocumentoIdentidadService;
    @GetMapping("/listar")
    public List<TipoDocumentoIdentidad> listarTiposDocumentosIdentidad(){
        return tipoDocumentoIdentidadService.listarTiposDocumentosIdentidad();
    }
}
