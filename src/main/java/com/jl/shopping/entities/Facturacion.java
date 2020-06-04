package com.jl.shopping.entities;

import javax.persistence.*;
import org.apache.naming.factory.SendMailFactory;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Entity
@Table(name="facturacion")
public class Facturacion {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int idFacturacion;
    private int idProducto;
    private int idCompra;
    private int cantidad;
    private float precioCompra;

    public int getidFacturacion() {
        return idFacturacion;
    }

    public void setidFacturacion(int idFacturacion) {
        this.idFacturacion = idFacturacion;
    }

    public int getidProducto() {
        return idProducto;
    }

    public void setidProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getidCompra() {
        return idCompra;
    }

    public void setidCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public float getcantidad() {
        return cantidad;
    }

    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getprecioCompra() {
        return precioCompra;
    }

    public void setprecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }
}
