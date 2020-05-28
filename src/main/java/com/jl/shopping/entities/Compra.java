package com.jl.shopping.entities;

import javax.persistence.*;

@Entity
@Table(name="compra")
public class Compra {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int idCompra;
    private int idCliente;
    private int idPago;
    private char fechaCompra [45];
    private float monto;

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public char[] getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(char[] fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
}
