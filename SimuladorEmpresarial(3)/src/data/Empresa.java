/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

    private String nombre;
    private String formaJuridica;
    private long nit;
    private String actividadEconomica;
    private String direccion;
    private int telefono;
    private int inversion;
    private double ingresosVentas;
    private double gastosVarios;
    private double gastosCompras;
    private double impuestoIVA;
    private double gatosSalario;
    private double gastoDeudas;
    private double serviciosPublicos;
    private double arriendo;
    private double utilidadNeta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFormaJuridica() {
        return formaJuridica;
    }

    public void setFormaJuridica(String formaJuridica) {
        this.formaJuridica = formaJuridica;
    }

    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getInversion() {
        return inversion;
    }

    public void setInversion(int inversion) {
        this.inversion = inversion;
    }

    public double getIngresosVentas() {
        return ingresosVentas;
    }

    public void setIngresosVentas(double ingresosVentas) {
        this.ingresosVentas = ingresosVentas;
    }

    public double getGastosVarios() {
        return gastosVarios;
    }

    public void setGastosVarios(double gastosVarios) {
        this.gastosVarios = gastosVarios;
    }

    public double getGastosCompras() {
        return gastosCompras;
    }

    public void setGastosCompras(double gastosCompras) {
        this.gastosCompras = gastosCompras;
    }

    public double getImpuestoIVA() {
        return impuestoIVA;
    }

    public void setImpuestoIVA(double impuestoIVA) {
        this.impuestoIVA = impuestoIVA;
    }

    public double getGatosSalario() {
        return gatosSalario;
    }

    public void setGatosSalario(double gatosSalario) {
        this.gatosSalario = gatosSalario;
    }

    public double getGastoDeudas() {
        return gastoDeudas;
    }

    public void setGastoDeudas(double gastoDeudas) {
        this.gastoDeudas = gastoDeudas;
    }

    public double getServiciosPublicos() {
        return serviciosPublicos;
    }

    public void setServiciosPublicos(double serviciosPublicos) {
        this.serviciosPublicos = serviciosPublicos;
    }

    public double getArriendo() {
        return arriendo;
    }

    public void setArriendo(double arriendo) {
        this.arriendo = arriendo;
    }

    public double getUtilidadNeta() {
        return utilidadNeta;
    }

    public void setUtilidadNeta(double utilidadNeta) {
        this.utilidadNeta = utilidadNeta;
    }

    public void ingresarDineroInversion(){

    }
    public void ingresarDineroVentas(){

    }

    public void pagoGastosVarios(){

    }

    public void pagoMateriaPrimaEInsumos(){

    }

    public void paagoEquiposYMaquinaria(){

    }

    public void pagoImpuestos(){

    }

    public void pagoSalario(){

    }

    public void pagoDeudas(){

    }

    public void pagoServiciosPublicos(){

    }

    public void pagoArriendo(){

    }

    public void solicitarPrestamo(){

    }
    public Empresa(int inversionInicial, double ingresos, double egresos, double utilidadNeta) {
        this.inversionInicial=inversionInicial;
        this.ingresos=ingresos;
        this.egresos=egresos;
        this.utilidadNeta=utilidadNeta;
        empleados = new ArrayList<>();
        compras = new ArrayList<>();
        productos = new ArrayList<>();

    }

    public int venderProducto(Productos productos) {
        Scanner sn = new Scanner(System.in);
        int cantidad;
        int resultado;
        int precio;
        productos.getPrecio();
        System.out.println("Ingrese el precio del producto vendido ");
        precio = sn.nextInt();
        System.out.println("Ingrese la cantidad de productos ");

        cantidad = sn.nextInt();
        if (cantidad > 0) {
            resultado = precio * cantidad;
        } else {
            resultado = 0;

        }
        return resultado;

    }


    public void solicitudPrestamo() {

    }

    public void ingresarInversionCaja() {
    }

   }
