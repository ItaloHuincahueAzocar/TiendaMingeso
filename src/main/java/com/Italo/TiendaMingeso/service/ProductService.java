package com.Italo.TiendaMingeso.service;

import java.util.List;

import com.Italo.TiendaMingeso.model.Producto;



public interface ProductService {
    
    public Producto saveProduct(Producto product);

    public List<Producto> getAllProducts();

    public List<Producto> Producto();

    public List<Producto> CalcularNuevosPrecios();

}
