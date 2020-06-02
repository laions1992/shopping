package com.jl.shopping.repositories;

import com.jl.shopping.entities.Facturacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface FacturacionRepository extends CrudRepository<Facturacion, Integer> {
    List<Facturacion> findAll();
}
