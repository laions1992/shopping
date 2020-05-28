package com.jl.shopping.entities;

import javax.persistence.*;

@Entity
@Table(name="facturacion")
public class Facturacion {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int idFacturacion;
    private int idProducto;
    private int idCompra;
    private float cantidad;
    private float precioCompra;

    public int getIdFacturacion() {
        return idFacturacion;
    }

    public void setIdFacturacion(int idFacturacion) {
        this.idFacturacion = idFacturacion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }
}
