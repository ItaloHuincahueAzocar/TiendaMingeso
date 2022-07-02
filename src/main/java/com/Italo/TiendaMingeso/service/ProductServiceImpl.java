package com.Italo.TiendaMingeso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Italo.TiendaMingeso.model.Producto;
import com.Italo.TiendaMingeso.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{


    @Autowired
    private ProductRepository productRepository;

    @Override
    public Producto saveProduct(Producto product) {
        return productRepository.save(product);
    }

    @Override
    public List<Producto> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Producto> Producto() {
        return productRepository.findAll();
    }

    @Override
    public List<Producto> CalcularNuevosPrecios() {
        
        List<Producto> lista = productRepository.findAll();

        for (int i = 0; i< lista.size(); i++) {
            System.out.println(lista.get(i).getPrecioCLP());
        }

        return lista;
    }
    
}