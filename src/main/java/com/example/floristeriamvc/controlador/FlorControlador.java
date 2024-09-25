package com.example.floristeriamvc.controlador;

import com.example.floristeriamvc.modelo.Flor;
import com.example.floristeriamvc.servicio.FlorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/flores")
public class FlorControlador {

    @Autowired
    private FlorServicio florServicio;

    // Método para listar todas las flores y mostrar en flores.html
    @GetMapping
    public String listarFlores(Model model) {
        List<Flor> flores = florServicio.obtenerTodasLasFlores();
        model.addAttribute("flores", flores);
        return "flores"; // Esto retorna la vista flores.html
    }

    // Método para mostrar el formulario de nueva flor en nuevaFlor.html
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaFlor(Model model) {
        model.addAttribute("flor", new Flor()); // Agrega una nueva instancia de Flor al modelo
        return "nuevaFlor"; // Esto retorna la vista nuevaFlor.html
    }

    // Método para crear una nueva flor y redirigir a la lista de flores
    @PostMapping
    public String crearFlor(@ModelAttribute Flor flor) {
        florServicio.crearFlor(flor); // Guarda la nueva flor en la base de datos
        return "redirect:/flores"; // Redirige a la página de lista de flores después de agregar
    }
}
