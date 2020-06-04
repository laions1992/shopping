package com.jl.shopping.entities;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
@Entity
@Table(name="pago")
public class Pago {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int idpago;
    private float monto;

    public int getidPago() {
        return idpago;
    }

    public void setidpago(int idPago) {
        this.idpago = idPago;
    }

    public float getmonto() {
        return monto;
    }

    public void setmonto(float monto) {
        this.monto = monto;
    }
}
