package com.coderhouse.model.transactions;

import com.coderhouse.pagos.MedioDePago;

import java.util.Date;

public abstract class Transaccion {

    private int idTransaccion;
    //private Carrito carrito;
    private Date fecha;
    //private Factura factura;
    private MedioDePago medioDePago;
    private float total;

    //Constructor

    public Transaccion(int idTransaccion, Date fecha, MedioDePago medioDePago, float total) {
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
        this.medioDePago = medioDePago;
        this.total = total;
    }
}
