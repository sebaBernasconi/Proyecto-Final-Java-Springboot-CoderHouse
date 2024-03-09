package com.coderhouse.model.transactions;
import com.coderhouse.model.user.Admin;
import com.coderhouse.model.user.Client;
import com.coderhouse.pagos.MedioDePago;

import java.util.Date;

public class Venta extends Transaccion {

    private Client client;
    private Admin vendedor;

    public Venta(int idTransaccion, Date fecha, MedioDePago medioDePago, float total) {
        super(idTransaccion, fecha, medioDePago, total);
    }
}
