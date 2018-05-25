
package data;


import java.util.Scanner;

public class Impuesto {

    private int periodoDePago;
    private double pagoIVA;
    private double valorIngresoSoportado;
    private double valorIngresoRepercutido;

        public int getPeriodoDePago() {

            return periodoDePago;
        }

        public void setPeriodoDePago(int periodoDePago) {

            this.periodoDePago = periodoDePago;
        }

        public double getPagoIVA() {

            return pagoIVA;
        }

        public void setPagoIVA(double pagoIVA) {

            this.pagoIVA = pagoIVA;
        }

        public double getValorIngresoSoportado() {

            return valorIngresoSoportado;
        }

        public void setValorIngresoSoportado(double valorIngresoSoportado) {

            this.valorIngresoSoportado = valorIngresoSoportado;
        }

        public double getValorIngresoRepercutido() {

            return valorIngresoRepercutido;
        }

        public void setValorIngresoRepercutido(double valorIngresoRepercutido) {

            this.valorIngresoRepercutido = valorIngresoRepercutido;
        }

        public void generarPagoImpuesto() {

            double totalVentas, totalCompras;
            Scanner sn=new Scanner(System.in);

            System.out.println("Ingrese periodo a pagar: ");
            periodoDePago = sn.nextInt();


            System.out.println("Ingrese el dinero generado en ventas: ");
            totalVentas=sn.nextDouble();
            valorIngresoSoportado=(19*totalVentas)/100;

            System.out.println("Ingrese en dinero pagado en compras: ");
            totalCompras=sn.nextDouble();
            valorIngresoRepercutido=(19*totalCompras)/100;

            pagoIVA=valorIngresoSoportado-valorIngresoRepercutido;
            System.out.println("El valor a pagar en el periodo " +getPeriodoDePago()+ "es: " +getPagoIVA());


        }
    }






    

