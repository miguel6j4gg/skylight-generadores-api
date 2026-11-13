package com.skylight.generadores.controller;

import com.skylight.generadores.model.Equipo;
import com.skylight.generadores.service.EquipoService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/equipos")
public class EquipoController {

    private final EquipoService equipoService;

    public EquipoController(EquipoService equipoService) {
        this.equipoService = equipoService;
    }

    // MÉTODO GET: Consultar todos los equipos
    @GetMapping
    public ResponseEntity<?> listarEquipos() {

        return ResponseEntity.ok(
                equipoService.listarEquipos()
        );
    }

    // MÉTODO POST: Registrar un nuevo equipo
    @PostMapping
    public ResponseEntity<?> registrarEquipo(
            @RequestBody Equipo equipo) {

        if (equipo == null
                || equipo.getCodigo() == null
                || equipo.getCodigo().isBlank()
                || equipo.getNombre() == null
                || equipo.getNombre().isBlank()
                || equipo.getMarca() == null
                || equipo.getMarca().isBlank()
                || equipo.getEstado() == null
                || equipo.getEstado().isBlank()
                || !Double.isFinite(equipo.getPotencia())
                || equipo.getPotencia() <= 0) {

            Map<String, String> error = new HashMap<>();
            error.put("mensaje",
                    "Todos los campos son obligatorios y la potencia debe ser mayor a cero.");

            return ResponseEntity.badRequest().body(error);
        }

        boolean registrado =
                equipoService.registrarEquipo(equipo);

        if (!registrado) {

            Map<String, String> error = new HashMap<>();
            error.put("mensaje",
                    "Ya existe un equipo con ese código.");

            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(error);
        }

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(equipo);
    }
}