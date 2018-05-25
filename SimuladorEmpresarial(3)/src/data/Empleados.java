/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;


import java.util.ArrayList;
import java.util.Scanner;

public class Empleados {

    private String cargo;
    private double salario;
    private double horasTrabajadas;
    private int auxilioTransporte;
    private double eps;
    private double afp;
    private double arl;
    private double sena;
    private double icbf;
    private double ccf;
    private double vacaciones;
    private double prima;
    private double cesantias;
    private double intCesantias;

    public Empleados(String cargo, double salario, double horasTrabajadas, int auxilioTransporte, double eps, double afp, double arl, double sena, double icbf, double ccf, double vacaciones, double cesantias, double intCesantias, double prima ){

        this.cargo=cargo;
        this.salario=salario;
        this.horasTrabajadas=horasTrabajadas;
        this.auxilioTransporte=auxilioTransporte;
        this.eps=eps;
        this.afp=afp;
        this.arl=arl;
        this.sena=sena;
        this.icbf=icbf;
        this.ccf=ccf;
        this.vacaciones=vacaciones;
        this.prima=prima;
        this.cesantias=cesantias;
        this.intCesantias=intCesantias;
    }

    public String getCargo() {

        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(int auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public double getIcbf() {
        return icbf;
    }

    public void setIcbf(double icbf) {
        this.icbf = icbf;
    }

    public double getCcf() {
        return ccf;
    }

    public void setCcf(double ccf) {
        this.ccf = ccf;
    }

    public double getIntCesantias() {

        return intCesantias;
    }

    public void setIntCesantias(double intCesantias) {

        this.intCesantias = intCesantias;
    }

    public double getHorasTrabajadas() {

        return horasTrabajadas;
    }

    public double getPrima() {

        return prima;
    }

    public double getCesantias() {

        return cesantias;
    }

    public double getArl() {

        return arl;
    }

    public double getEps() {

        return eps;
    }

    public double getAfp() {

        return afp;
    }

    public double getVacaciones() {

        return vacaciones;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {

        this.horasTrabajadas = horasTrabajadas;
    }

    public void setPrima(double prima) {

        this.prima = prima;
    }

    public void setCesantias(double cesantias) {

        this.cesantias = cesantias;
    }

    public void setArl(double arl) {

        this.arl = arl;
    }

    public void setEps(double eps) {

        this.eps = eps;
    }

    public void setAfp(double afp) {

        this.afp = afp;
    }

    public void setVacaciones(double vacaciones) {

        this.vacaciones = vacaciones;
    }

    public double getSena() {
        return sena;
    }

    public void setSena(double sena) {
        this.sena = sena;
    }

    public void generarPagoSalario() {

        Scanner sc= new Scanner(System.in);
        double salario, auxilioTrabajo, eps, afp, arl, icbf, sena, ccf, vacaciones, cesantias, prima, intCesantias, nuevoSalario, totalSalario;
        int numero;
        boolean respuesta;


        System.out.println("Ingresar sueldo base del empleado: ");
        salario = sc.nextDouble();

        auxilioTrabajo = 88211;
        eps = salario * 0.085;
        afp = salario * 0.12;
        arl = salario * 0.02436;
        icbf = salario * 0.03;
        sena = salario * 0.02;
        ccf = salario * 0.04;


        if (salario <= 1562484) {

            nuevoSalario = salario + auxilioTrabajo + eps + afp + arl + icbf + sena + ccf;

        } else {
            nuevoSalario = salario + eps + afp + arl + icbf + sena + ccf;

        }

        System.out.println("El sueldo de un empleado es: " + nuevoSalario);

        System.out.println("Ingrese la cantidad de empleados con este sueldo :");
        numero = sc.nextInt();

        totalSalario = numero * nuevoSalario;

        System.out.println("El valor total de la nómina es: " + totalSalario);

        System.out.println("Se pagaran vacaciones? ");
        respuesta = sc.nextBoolean();
        if (respuesta == true) {
            vacaciones = (auxilioTrabajo / 2);
            System.out.println("El valor a pagar es: " + vacaciones);
        } else {
            System.out.println("El valor total de la nómina es: " + salario);
        }

        System.out.println("Se pagaran cesantias? ");
        respuesta = sc.nextBoolean();
        if (respuesta == true) {
            cesantias = salario;
            System.out.println("El valor a pagar es: " + cesantias);
        } else {
            System.out.println("El valor total de la nómina es: " + salario);
        }

        System.out.println("Se pagaran intereses de cesantias? ");
        respuesta = sc.nextBoolean();
        if (respuesta == true) {
            intCesantias = salario * 0.12;
            System.out.println("El valor a pagar es: " + intCesantias);
        } else {
            System.out.println("El valor total de la nómina es: " + salario);
        }

        System.out.println("Se pagara prima de servicios? ");
        respuesta = sc.nextBoolean();
        if (respuesta == true) {
            prima = salario;
            System.out.println("El valor a pagar es: " + prima);

        } else {
            System.out.println("El valor total de la nómina es: " + salario);

        }
    }
}











