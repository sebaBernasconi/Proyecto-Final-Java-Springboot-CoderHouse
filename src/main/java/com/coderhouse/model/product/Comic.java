package com.coderhouse.model.product;

public class Comic extends Producto{

    private String autor;
    private String idioma;
    private boolean tapaDura;

    //Constructor

    public Comic(int idProd, String nombre, String descripcion,
                 int stock, float precio, String autor, String idioma, boolean tapaDura) {
        super(idProd, nombre, descripcion, stock, precio);
        this.autor = autor;
        this.idioma = idioma;
        this.tapaDura = tapaDura;
    }


    //Getters y Setters

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isTapaDura() {
        return tapaDura;
    }

    public void setTapaDura(boolean tapaDura) {
        this.tapaDura = tapaDura;
    }
}
