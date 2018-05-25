/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;


public class Productos {
    private String tipo;
    private int precio;
    private int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

    public String getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void generarDineroVentas(){

    }

    public Productos(String tipo, int precio, int cantidad) {
        this.tipo = tipo;
        this.precio = precio;
        this.cantidad=cantidad;
    }
    @Override
         public String toString(){
             return "El tipo de producto es: "+this.getTipo()+ " Su precio es: $ "+this.getPrecio()+ "y la cantidad vendida es: "+this.getCantidad();
         }
            
}
