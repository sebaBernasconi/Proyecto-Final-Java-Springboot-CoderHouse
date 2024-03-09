package com.coderhouse.model.transactions;
import com.coderhouse.model.user.Admin;
import com.coderhouse.model.user.Client;
import com.coderhouse.model.payment.MedioDePago;

import java.util.Date;

public class Venta extends Transaccion {

    private Client client;
    private Admin vendedor;

    //Constructor

    public Venta(int idTransaccion, Date fecha, MedioDePago medioDePago,
                 float total, Client client, Admin vendedor) {
        super(idTransaccion, fecha, medioDePago, total);
        this.client = client;
        this.vendedor = vendedor;
    }
}
