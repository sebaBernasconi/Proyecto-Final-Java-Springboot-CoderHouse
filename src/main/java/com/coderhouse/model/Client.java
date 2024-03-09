package com.coderhouse.model;

import com.coderhouse.pagos.MedioDePago;

import java.util.List;

public class Client extends User{

    //Descomentar cunado cree los objetos

    private List<MedioDePago> medioDePago;
    //private Carrito carrito;
    private List<Compra> compras;

    //Constructor
    public Client(int idUsr, int cuil, String nombre, String mail, String password) {
        super(idUsr, cuil, nombre, mail, password);
        //agregar los atributos que estan comentados
    }

    //Metodos de la clase


    //Getters y Setters


}
