package com.registro.pacientes.Services;

import com.registro.pacientes.DAO.UbigeoRepository;
import com.registro.pacientes.DTO.DTOResponse.DepartamentoDTOResponse;
import com.registro.pacientes.Entities.Ubigeo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbigeoService {
    @Autowired
    private UbigeoRepository ubigeoRepository;

    public List<Ubigeo> listarUbigeos(){
        return ubigeoRepository.findAll();
    }
    public List<Ubigeo> listarDepartamentos() {return ubigeoRepository.findAllDepartamentos();}
    public List<Ubigeo> listarProvincias() {return ubigeoRepository.findAllProvincias();}
    public List<Ubigeo> listarDistritos() {return ubigeoRepository.findAllDistritos();}
    public List<Ubigeo> listarProvinciasByDepartamento(String codDpto){
        return ubigeoRepository.findProvinciasByCodigoDepartamento(codDpto);
    }
    public List<Ubigeo> listarDistritosByProvinciaAndDepartamento(String codProvincia, String codDpto){
        return ubigeoRepository.findDistritosByCodigoProvinciaAndCodigoDepartamento(codProvincia, codDpto);
    }
}
