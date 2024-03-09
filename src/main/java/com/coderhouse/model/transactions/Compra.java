package com.coderhouse.model.transactions;

import com.coderhouse.model.user.Admin;
import com.coderhouse.pagos.MedioDePago;

import java.util.Date;

public class Compra extends Transaccion {
    private Admin vendedor;

    public Compra(int idTransaccion, Date fecha, MedioDePago medioDePago, float total) {
        super(idTransaccion, fecha, medioDePago, total);
    }

    //Constructor

    //Metodos de la clase


    //Getters y Setters
}
