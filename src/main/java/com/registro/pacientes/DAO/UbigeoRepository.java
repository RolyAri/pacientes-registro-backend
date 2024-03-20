package com.registro.pacientes.DAO;

import com.registro.pacientes.DTO.DTOResponse.DepartamentoDTOResponse;
import com.registro.pacientes.Entities.Ubigeo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface UbigeoRepository extends JpaRepository<Ubigeo,String> {
    @Query(value = "SELECT * FROM obtener_departamentos()", nativeQuery = true)
    List<Ubigeo> findAllDepartamentos();
    @Query(value = "SELECT * FROM obtener_provincias()", nativeQuery = true)
    List<Ubigeo> findAllProvincias();
    @Query(value = "SELECT * FROM obtener_distritos()", nativeQuery = true)
    List<Ubigeo> findAllDistritos();
}
