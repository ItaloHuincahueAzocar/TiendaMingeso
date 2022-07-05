package com.Italo.TiendaMingeso.service;

import java.util.ArrayList;
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
    public List<Producto> Producto() {
        return productRepository.findAll();
    }

    @Override
    public List<String> CalcularNuevosPrecios(double valorUF) {
       
        List<Producto> listaProd = this.Producto();
        List <String> resultado = new ArrayList<String>();

        for (int i = 0; i< listaProd.size(); i++) {
            double precioUSD = (listaProd.get(i).getPrecioCLP() / valorUF);
            String valor = Double.toString(precioUSD);
            resultado.add(i, valor);
        }

        return resultado;
    }
}