package com.producto.producto.infraestructura.persistencia.entidad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    private Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto(1l, "producto");
    }

    @Test
    void testSetYGetId() {
        Long id = 2L;

        producto.setId(id);

        assertEquals(id, producto.getId());
    }

    @Test
    void testSetYGetName() {
        String nombre = "Producto de prueba";

        producto.setNombre(nombre);

        assertEquals(nombre, producto.getNombre());
    }

}