package com.example.floristeriamvc.servicio;

import com.example.floristeriamvc.modelo.Flor;
import com.example.floristeriamvc.repositorio.FlorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlorServicioImpl implements FlorServicio {

    @Autowired
    private FlorRepositorio florRepositorio;

    @Override
    public List<Flor> obtenerTodasLasFlores() {
        return florRepositorio.findAll();
    }

    @Override
    public Flor crearFlor(Flor flor) {
        return florRepositorio.save(flor);
    }

    @Override
    public Flor obtenerFlorPorId(Long id) {
        return florRepositorio.findById(id).orElse(null);
    }

    @Override
    public Flor actualizarFlor(Long id, Flor flor) {
        Flor florExistente = obtenerFlorPorId(id);
        if (florExistente != null) {
            florExistente.setTipo(flor.getTipo());
            florExistente.setColor(flor.getColor());
            florExistente.setVariedad(flor.getVariedad());
            florExistente.setCantidadDisponible(flor.getCantidadDisponible());
            florExistente.setPrecioCompra(flor.getPrecioCompra());
            florExistente.setPrecioVenta(flor.getPrecioVenta());
            return florRepositorio.save(florExistente);
        }
        return null;
    }

    @Override
    public void eliminarFlor(Long id) {
        florRepositorio.deleteById(id);
    }
}
