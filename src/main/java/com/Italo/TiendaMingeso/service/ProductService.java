package com.Italo.TiendaMingeso.service;

import java.util.List;

import com.Italo.TiendaMingeso.model.Producto;



public interface ProductService {
    
    public Producto saveProduct(Producto product);

    public List<Producto> Producto();

    public List<String> CalcularNuevosPrecios(double valorUF);

}
