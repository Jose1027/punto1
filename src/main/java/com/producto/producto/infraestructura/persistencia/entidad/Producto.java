package com.producto.producto.infraestructura.persistencia.entidad;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Producto {
    private Long id;
    private String nombre;
}
