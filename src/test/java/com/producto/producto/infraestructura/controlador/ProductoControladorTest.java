package com.producto.producto.infraestructura.controlador;

import com.producto.producto.infraestructura.persistencia.entidad.Producto;
import com.producto.producto.infraestructura.persistencia.servicio.ProductoServicio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ProductoControladorTest {

    @Mock
    private ProductoServicio productoServicio;

    @InjectMocks
    private ProductoControlador productoControlador;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        
        when(productoServicio.getProductById(1L))
                .thenReturn(Mono.just(new Producto(1L, "Producto1")));

        when(productoServicio.getProductById(2L))
                .thenReturn(Mono.just(new Producto(2L, "Producto2")));
    }

    @Test
    void testObtenerProductoPorId() {
        Mono<Producto> productoMono = productoControlador.getProductById(1L);

        Producto producto = productoMono.block();
        assertEquals("Producto1", producto.getNombre());
    }

    @Test
    void testObtenerProductoPorNoEncontrado() {
        Mono<Producto> productoMono = productoControlador.getProductById(999L);
        assertEquals(null, productoMono.block());
    }

}