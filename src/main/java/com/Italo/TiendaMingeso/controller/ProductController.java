package com.Italo.TiendaMingeso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Italo.TiendaMingeso.model.Producto;
import com.Italo.TiendaMingeso.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public String addString(@RequestBody Producto product) {
        productService.saveProduct(product);
        return "Nuevo producto añadido: " + product.getNombre();
    }

    @GetMapping("/getAll")
    public List<Producto> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/producto")
    public List<Producto> Producto(){
        return productService.Producto();
    }
    
    @GetMapping("/CalcularNuevosPrecios")
    public List<Producto> CalcularNuevosPrecios(){
        return productService.CalcularNuevosPrecios();
    }

}
