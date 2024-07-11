package com.producto.producto.infraestructura.persistencia.servicio;

import com.producto.producto.infraestructura.persistencia.entidad.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;

class ProductoServicioTest {

    private ProductoServicio productoServicio;

    @BeforeEach
    void setUp() {
        productoServicio = new ProductoServicio();
    }

    @Test
    void testObtenerProductoPorId() {
        Long productoId = 1L;

        Mono<Producto> productoMono = productoServicio.getProductById(productoId);

        Producto producto = productoMono.block();
        assertEquals(productoId, producto.getId());
    }

}