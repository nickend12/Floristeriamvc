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

    @GetMapping
    public String listarFlores(Model model) {
        List<Flor> flores = florServicio.obtenerTodasLasFlores();
        model.addAttribute("flores", flores);
        return "flores";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaFlor(Model model) {
        model.addAttribute("flor", new Flor());
        return "nuevaFlor";
    }

    @PostMapping
    public String crearFlor(@ModelAttribute Flor flor) {
        florServicio.crearFlor(flor);
        return "redirect:/flores";
    }

    // Implementar métodos para editar y eliminar flores si es necesario
}
