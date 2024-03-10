package com.coderhouse.controllers;

import com.coderhouse.model.product.Comic;
import com.coderhouse.model.product.Producto;
import com.coderhouse.model.transactions.Compra;
import com.coderhouse.model.transactions.Venta;
import com.coderhouse.model.user.Admin;
import com.coderhouse.model.user.Carrito;
import com.coderhouse.model.user.Client;

import java.util.ArrayList;
import java.util.List;

public class ControllerUser {

    private int idClient;
    private int idAdmin;

    private List<Client> listadoDeClientes;
    private List<Admin> listadoDeAdmins;
    private static  ControllerUser instancia;


    //Constructor
    public ControllerUser() {
        this.listadoDeClientes = new ArrayList<>();
        this.listadoDeAdmins = new ArrayList<>();
    }

    //Metodos del Controller
    private static ControllerUser getInstancia(){
        if (instancia == null){
            return  instancia = new ControllerUser();
        }else {
            return instancia;
        }
    }

    public void registrarCliente(int cuil, String nombre, String mail,
                                 String password){
        if (buscarCliente(cuil) == null){
            Client c = new Client(idClient,cuil,nombre,mail,password,
                    null,null,null);
            idClient ++;
            listadoDeClientes.add(c);
        }else {
            System.out.println("Ya hay un cliente registrado con el cuil: " + cuil);
        }


    }

    public void registrarAdmin(int cuil, String nombre, String mail,
                               String password){
        if (buscarAdmin(cuil) == null){
            Admin a = new Admin(idAdmin,cuil,nombre,mail,password,null);
            idAdmin ++;
            listadoDeAdmins.add(a);
        }else {
            System.out.println("Ya hay un admin registrado con el cuil: " + cuil);
        }
    }

    public void agregarAlCarrito(int cuil, int idProducto) {

        Client c = buscarCliente(cuil);
        /*ControllerProducto controllerProducto = ControllerProducto.getInstancia();
        Producto p = controllerProducto.buscarProducto(idProducto);
        if(c != null && p != null){
            c.agregarAlCarrito(p);
        }*/
    }

    public void sacarDelCarrito(int cuil, int idProducto){
        Client c = buscarCliente(cuil);

        /*ControllerProducto controllerProducto = ControllerProducto.getInstancia();
        Producto p = controllerProducto.buscarProducto(idProducto);

        Carrito carrito = c.getCarrito();

        if((c != null && p != null) && carrito.estaEnElCarrito(idProducto)){
            c.agregarAlCarrito(p);
        }*/
    }

    public void pagarCarrito(int cuil){
        Client c = buscarCliente(cuil);
        c.pagarCarrito();
    }

    public void verComprasDeUnCliente(int cuil){
        Client c = buscarCliente(cuil);
        List<Compra> compras = c.getCompras();

        for (Compra compra :
                compras) {
            System.out.println(compra.toString());
        }
    }

    public void verVentasDeUnAdmin(int cuil){
        Admin a = buscarAdmin(cuil);
        List<Venta> ventas = a.getVentas();

        for (Venta v :
                ventas) {
            System.out.println(v.toString());
        }
    }

    public void mostrarClientes(){
        for (Client c :
                listadoDeClientes) {
            System.out.println(c.toString());
        }
    }

    public void mostrarAdmins(){
        for (Admin a :
                listadoDeAdmins) {
            System.out.println(a.toString());
        }
    }

    //Metodos privados que devuelven objetos que el cliente nunca debe ver
    private Client buscarCliente(int cuil){
        for (Client c :
                listadoDeClientes) {
            if (cuil == c.getCuil()) {
                return c;
            }
        }
        return null;
    }

    private Admin buscarAdmin(int cuil){
        for (Admin a :
                listadoDeAdmins) {
            if (cuil == a.getCuil()){
                return a;
            }
        }
        return null;
    }

}
