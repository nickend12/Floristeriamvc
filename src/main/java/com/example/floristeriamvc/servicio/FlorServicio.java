package com.example.floristeriamvc.servicio;


import com.example.floristeriamvc.modelo.Flor;

import java.util.List;

public interface FlorServicio {
    List<Flor> obtenerTodasLasFlores();
    Flor crearFlor(Flor flor);
    Flor obtenerFlorPorId(Long id);
    Flor actualizarFlor(Long id, Flor flor);
    void eliminarFlor(Long id);
}
