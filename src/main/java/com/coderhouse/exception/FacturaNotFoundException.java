package com.coderhouse.exception;

import com.coderhouse.model.ticket.Factura;

public class FacturaNotFoundException extends Exception{
    public FacturaNotFoundException(String msj){
        super(msj);
    }
}
