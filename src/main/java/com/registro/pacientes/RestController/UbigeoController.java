package com.registro.pacientes.RestController;

import com.registro.pacientes.DTO.DTOResponse.DepartamentoDTOResponse;
import com.registro.pacientes.DTO.DTOResponse.DistritoDTOResponse;
import com.registro.pacientes.DTO.DTOResponse.ProvinciaDTOResponse;
import com.registro.pacientes.Entities.Ubigeo;
import com.registro.pacientes.Services.UbigeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ubigeo")
@CrossOrigin("*")
public class UbigeoController {
    @Autowired
    private UbigeoService ubigeoService;

    @GetMapping("/listar")
    public List<Ubigeo> listarUbigeos(){
        return ubigeoService.listarUbigeos();
    }
    @GetMapping("/departamento/listar")
    public List<DepartamentoDTOResponse> listarDepartamentos() {
        List<DepartamentoDTOResponse> departamentos = new ArrayList<>();
        List<Ubigeo> ubigeos = ubigeoService.listarDepartamentos();
        ubigeos.forEach(ubigeo -> {
            departamentos.add(new DepartamentoDTOResponse(ubigeo.getCodigo_departamento(), ubigeo.getDescripcion_departamento()));
        });
        return departamentos;
    }
    @GetMapping("/provincia/listar")
    public List<ProvinciaDTOResponse> listarPronvicias(){
        List<ProvinciaDTOResponse> provincias = new ArrayList<>();
        List<Ubigeo> ubigeos = ubigeoService.listarProvincias();
        ubigeos.forEach(ubigeo -> {
            provincias.add(new ProvinciaDTOResponse(ubigeo.getCodigo_provincia(), ubigeo.getDescripcion_provincia()));
        });
        return provincias;
    }
    @GetMapping("/distrito/listar")
    public List<DistritoDTOResponse> listarDistritos(){
        List<DistritoDTOResponse> distritos = new ArrayList<>();
        List<Ubigeo> ubigeos = ubigeoService.listarDistritos();
        ubigeos.forEach(ubigeo -> {
            distritos.add(new DistritoDTOResponse(ubigeo.getCodigo_distrito(), ubigeo.getDescripcion_distrito()));
        });
        return distritos;
    }
}
