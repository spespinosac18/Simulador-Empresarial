/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author AIDA GOMEZ
 */
public class Compras {
    private String tipo;
    private int cantidad;
    private int precio;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {

        return cantidad;
    }

    public int getPrecio() {

        return precio;
    }

    public void setCantidad(int cantidad) {

        this.cantidad = cantidad;
    }

    public void setPrecio(int precio) {

        this.precio = precio;
    }


    public void generarPagoCompras() {

    }
}
