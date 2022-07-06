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
    public List<Producto> CalcularNuevosPrecios() {
       
        List<Producto> listaProd = this.Producto();
       
        for (int i = 0; i< listaProd.size(); i++) {
            listaProd.get(i).setPrecioUSD(listaProd.get(i).getPrecioCLP() / 940.3);
            listaProd.get(i).setPrecioEUR(listaProd.get(i).getPrecioCLP() / 987.84);
        }

        return listaProd;
    }
}