package com.example.demo.controller;

import com.example.demo.dto.RecursoDTO;
import com.example.demo.model.RecursoImpugnatorio;
import com.example.demo.repository.RecursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/recursos")
@CrossOrigin(origins = "*")
public class RecursoController {

    @Autowired
    private RecursoRepository recursoRepository;

    @PostMapping("/registrar")
    public ResponseEntity<?> registrarRecurso(@RequestBody RecursoDTO dto) {
        try {
            RecursoImpugnatorio recurso = new RecursoImpugnatorio();
            recurso.setMateria(dto.getMateria() != null ? dto.getMateria() : "TRIBUTOS INTERNOS");
            recurso.setTipoRecurso(dto.getTipoRecurso() != null ? dto.getTipoRecurso() : "RECLAMACIÓN");
            recurso.setTipoActo(dto.getTipoActo());
            recurso.setNumValor(dto.getNumValor());
            recurso.setMontoMateria(dto.getMontoMateria());
            recurso.setPeriodo(dto.getPeriodo());
            recurso.setSustento(dto.getSustento());
            recurso.setEstado("PRESENTADO");
            recurso.setFechaRegistro(LocalDateTime.now());
            recurso.setUsuarioId(dto.getUsuarioId() != null ? dto.getUsuarioId() : 1L);

            recurso.setFecha(dto.getFecha());
            recurso.setIndicadorPreciosTransferencia(dto.getIndicadorPreciosTransferencia() != null ? dto.getIndicadorPreciosTransferencia() : "NO");
            recurso.setCodigoTributo(dto.getCodigoTributo());
            recurso.setMontoInsoluto(dto.getMontoInsoluto());
            recurso.setMontoInteres(dto.getMontoInteres());

            recursoRepository.save(recurso);

            return ResponseEntity.ok(Map.of(
                "mensaje", "Su recurso ha sido presentado satisfactoriamente.",
                "codigo", "REC-" + System.currentTimeMillis()
            ));
        } catch (Exception e) {
            return ResponseEntity.status(500).body(Map.of("mensaje", "Error interno al registrar el recurso: " + e.getMessage()));
        }
    }
}