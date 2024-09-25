package com.example.floristeriamvc.controlador;



import com.example.floristeriamvc.modelo.Pedido;
import com.example.floristeriamvc.servicio.PedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pedidos")
public class PedidoControlador {

    @Autowired
    private PedidoServicio pedidoServicio;

    @GetMapping
    public String listarPedidos(Model model) {
        List<Pedido> pedidos = pedidoServicio.obtenerTodosLosPedidos();
        model.addAttribute("pedidos", pedidos);
        return "pedidos"; // Asegúrate de tener una plantilla para mostrar los pedidos
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoPedido(Model model) {
        model.addAttribute("pedido", new Pedido());
        return "nuevoPedido"; // Asegúrate de tener una plantilla para crear un nuevo pedido
    }

    @PostMapping
    public String crearPedido(@ModelAttribute Pedido pedido) {
        pedidoServicio.crearPedido(pedido);
        return "redirect:/pedidos";
    }

    // Implementar métodos para editar y eliminar pedidos si es necesario
}
