package com.Italo.TiendaMingeso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Italo.TiendaMingeso.model.Product;
import com.Italo.TiendaMingeso.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public String addString(@RequestBody Product product) {
        productService.saveProduct(product);
        return "Nuevo producto añadido";
    }
}
