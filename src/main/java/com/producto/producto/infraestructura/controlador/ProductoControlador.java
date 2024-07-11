package com.producto.producto.infraestructura.controlador;

import com.producto.producto.infraestructura.persistencia.entidad.Producto;
import com.producto.producto.infraestructura.persistencia.servicio.ProductoServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
public class ProductoControlador {
    private final ProductoServicio productServicio;

    public ProductoControlador(ProductoServicio productServicio) {
        this.productServicio = productServicio;
    }

    @GetMapping("/{id}")
    public Mono<Producto> getProductById(@PathVariable Long id) {
        return productServicio.getProductById(id);
    }
}
