package com.jl.shopping.entities;

import javax.persistence.*;

@Entity
@Table(name="pago")
public class Pago {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    
    private int idPago;
    private float monto;

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
}