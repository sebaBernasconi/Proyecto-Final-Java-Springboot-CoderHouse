package com.coderhouse.model.payment;

public class MercadoPago extends MedioDePago{

    private  String user;
    private int cvu;
    private float saldo;

    //Constructor

    public MercadoPago(String user, int cvu, float saldo) {
        this.user = user;
        this.cvu = cvu;
        this.saldo = saldo;
    }
    //Metodos abstractos de la super clase desarrollados
    @Override
    public void pagar(float total) {
        if (this.saldo > total){
            this.saldo = this.saldo - total;
            System.out.println("Carrito abonado!");
        }else {
            System.out.println("El saldo de la cuenta es menor al" +
                    "total del carrito. No se puede realizar el pago");
            System.out.println("Saldo: " + this.saldo +
                    "\ntotal: " + total);
        }
    }

    //Getters y Setters

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getCvu() {
        return cvu;
    }

    public void setCvu(int cvu) {
        this.cvu = cvu;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
