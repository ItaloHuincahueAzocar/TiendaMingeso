package com.Italo.TiendaMingeso.service;

import java.util.List;

import com.Italo.TiendaMingeso.model.Product;



public interface ProductService {
    
    public Product saveProduct(Product product);

    public List<Product> getAllProducts ();
    

}
