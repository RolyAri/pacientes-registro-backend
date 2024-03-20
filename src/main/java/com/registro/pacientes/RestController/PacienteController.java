package com.registro.pacientes.RestController;

import com.registro.pacientes.Entities.Paciente;
import com.registro.pacientes.Services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pacientes")
@CrossOrigin("*")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @PostMapping("/registro")
    public Paciente registrarPaciente(@RequestBody Paciente paciente) {
        return pacienteService.registrarPaciente(paciente);
    }
    @GetMapping("/listar")
    public List<Paciente> listarPacientes(){
        return pacienteService.listarPacientes();
    }
    @GetMapping("/listar/{id}")
    public Paciente listarPacientePorId(@PathVariable("id") int id){
        return pacienteService.obtenerPorId(id);
    }
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> actualizarPaciente(@PathVariable("id") int id,@RequestBody Paciente paciente){
        Paciente pacienteObtenido = pacienteService.obtenerPorId(id);
        Map<String, String> mensaje = new HashMap<>();
        if (pacienteObtenido != null){
            paciente.setId_paciente(pacienteObtenido.getId_paciente());
            return ResponseEntity.ok(pacienteService.actualizarPaciente(paciente));
        }else {
            mensaje.put("success","El usuario con el id "+id+" no existe");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensaje);
        }
    }
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarPaciente(@PathVariable("id") int id){
        Paciente pacienteObtenido = pacienteService.obtenerPorId(id);
        Map<String, String> mensaje = new HashMap<>();
        if (pacienteObtenido != null){
            pacienteService.eliminarCliente(id);
            mensaje.put("success","Eliminado con éxito");
            return ResponseEntity.ok(mensaje);
        }else {
            mensaje.put("success","El usuario con el id "+id+" no existe");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensaje);
        }
    }
}
