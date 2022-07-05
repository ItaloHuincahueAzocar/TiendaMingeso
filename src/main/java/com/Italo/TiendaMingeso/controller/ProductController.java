package com.Italo.TiendaMingeso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Italo.TiendaMingeso.model.Producto;
import com.Italo.TiendaMingeso.service.ProductService;


@RestController
@RequestMapping("/mingeso")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public String addProduct(@RequestBody Producto product) {
        productService.saveProduct(product);
        return "Nuevo producto añadido: " + product.getNombre();
    }

    @GetMapping("/productos")
    public List<Producto> Producto(){
        return productService.Producto();
    }
    
    @GetMapping("/calcularNuevosPrecios")
    public List<String> CalcularNuevosPrecios(@RequestParam double valorUF){
        return productService.CalcularNuevosPrecios(valorUF);
    }
}
