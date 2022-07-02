package com.Italo.TiendaMingeso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Italo.TiendaMingeso.model.Producto;

@Repository
public interface ProductRepository extends JpaRepository<Producto, Integer>{

}
