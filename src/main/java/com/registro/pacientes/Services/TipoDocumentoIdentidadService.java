package com.registro.pacientes.Services;

import com.registro.pacientes.DAO.TipoDocumentoIdentidadRepository;
import com.registro.pacientes.Entities.TipoDocumentoIdentidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TipoDocumentoIdentidadService {
    @Autowired
    private TipoDocumentoIdentidadRepository tipoDocumentoIdentidadRepository;

    public List<TipoDocumentoIdentidad> listarTiposDocumentosIdentidad(){
        return tipoDocumentoIdentidadRepository.findAll();
    }
}
