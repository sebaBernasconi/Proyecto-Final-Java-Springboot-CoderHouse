package com.coderhouse.model.user;

import com.coderhouse.model.transactions.Venta;

import java.util.List;

public class Admin extends User {

    private List<Venta> ventas;

    public Admin(int idUsr, int cuil, String nombre, String mail, String password) {
        super(idUsr, cuil, nombre, mail, password);
    }
}
