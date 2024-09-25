package com.example.floristeriamvc.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Table_PEDIDO")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clienteNombre;
    private String clienteDireccion;
    private String clienteContacto;
    private String tipoArreglo;
    private String ocasion;
    private String fechaEntrega;
    private double presupuesto;
    private String estado; // en curso, completado, entregado
}
