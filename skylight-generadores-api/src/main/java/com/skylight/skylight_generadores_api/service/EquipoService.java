package com.skylight.generadores.service;

import com.skylight.generadores.model.Equipo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class EquipoService {

    private final ConcurrentHashMap<String, Equipo> equipos =
            new ConcurrentHashMap<>();

    public EquipoService() {

        // Equipos iniciales de Skylight Generadores

        equipos.put("SKG-001",
                new Equipo("SKG-001", "Generador industrial",
                        "Cummins", 75, "Disponible"));

        equipos.put("SKG-002",
                new Equipo("SKG-002", "Generador eléctrico",
                        "Perkins", 100, "En mantenimiento"));

        equipos.put("SKG-003",
                new Equipo("SKG-003", "Generador portátil",
                        "Honda", 6.25, "Disponible"));
    }

    // Consultar todos los equipos
    public List<Equipo> listarEquipos() {
        return new ArrayList<>(equipos.values());
    }

    // Registrar un nuevo equipo
    public boolean registrarEquipo(Equipo equipo) {

        return equipos.putIfAbsent(
                equipo.getCodigo(), equipo
        ) == null;
    }

    // Verificar si existe un equipo
    public boolean existeEquipo(String codigo) {
        return equipos.containsKey(codigo);
    }
}