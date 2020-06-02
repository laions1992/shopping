package com.jl.shopping.repositories;

import com.jl.shopping.entities.Pago;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
public interface PagoRepository extends CrudRepository <Pago, Integer> {
    List<Pago> findAll();
}
