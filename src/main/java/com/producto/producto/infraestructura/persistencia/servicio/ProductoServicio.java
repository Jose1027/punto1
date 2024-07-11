package com.producto.producto.infraestructura.persistencia.servicio;

import com.producto.producto.infraestructura.persistencia.entidad.Producto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductoServicio {
    private final Map<Long, Producto> productMap = new HashMap<>();

    public ProductoServicio() {
        productMap.put(1L, new Producto(1L, "Product1"));
        productMap.put(2L, new Producto(2L, "Product2"));
    }

    public Mono<Producto> getProductById(Long id) {
        return Mono.justOrEmpty(productMap.get(id));
    }
}
